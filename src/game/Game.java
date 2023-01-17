package game;

import players.Player;
import referee.Referee;

public class Game {
    public static int MAX_PLAYERS = 4;
    public static int MAX_DICES = 4;
    public static void main(String[] args) {
        // initialize ref
        Referee ref = new Referee("Giang Nam");

        ref.start();
    }
}
