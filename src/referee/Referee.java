package referee;

import dices.*;
import players.*;
import game.Game;

import java.util.ArrayList;

public class Referee {
    private final ArrayList<Player> playersList = new ArrayList<Player>();
    private final ArrayList<VirtualPlayer> virtualPlayersList = new ArrayList<VirtualPlayer>();
    private final ArrayList<Dice> dicesList = new ArrayList<Dice>();

    private int turn = 0;
    public String name;
    private boolean isGameOver;

    public Referee(String name) {
        this.name = name;
    }

    public void initialize() {
        // initialize dices
        dicesList.add(new Dice1());
        dicesList.add(new Dice2());
        dicesList.add(new Dice3());
        dicesList.add(new Dice4());

        // initialize virtual players
        virtualPlayersList.add(new VirtualPlayer1());
        virtualPlayersList.add(new VirtualPlayer2());
        virtualPlayersList.add(new VirtualPlayer3());
        virtualPlayersList.add(new VirtualPlayer4());

        // initialize players
        Player player1 = new Player("Peter");
        Player player2 = new Player("Judy");

        // add players
        playersList.add(player1);
        playersList.add(player2);

        int virtualPlayerNumber = Game.MAX_PLAYERS - playersList.size();
        for (int i = 0; i < virtualPlayerNumber; i++) {
            playersList.add(virtualPlayersList.get(i));
        }
    }

    public void start() {
        initialize();

        isGameOver = false;

        Dice dice1 = new Dice("100:0:0:0:0:0");

        dice1.roll();
    }

}
