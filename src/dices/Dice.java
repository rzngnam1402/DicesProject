package dices;

import game.Rollable;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Dice implements Rollable {
    List<Integer> ratioList;

    public Dice(List<Integer> ratioList) {
        this.ratioList = ratioList;
    }

    public Dice(String ratioExpr) {
        this(Arrays.stream(ratioExpr.split(":")).map(Integer::parseInt).collect(Collectors.toList()));
    }

    public Dice() {
        // TODO Auto-generated constructor stub
    }

    public void roll() {
        Random random = new Random();
        int sum = ratioList.stream().reduce(Integer::sum).get();
        int start = 0;
        int bound = 0;
        int ran = random.nextInt(sum);
        for (int i = 0; i < ratioList.size(); i++) {
            int ratio = ratioList.get(i);
            bound += ratio;
            if (ran >= start && ran < bound) {
                System.out.println(i + 1);
            }
            start += ratio;
        }
    }

}
