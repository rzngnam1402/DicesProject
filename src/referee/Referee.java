package referee;

import dices.*;
import game.Game;
import players.*;

import java.util.ArrayList;

public class Referee {
    private final ArrayList<Player> playersList = new ArrayList<Player>();
    private final ArrayList<VirtualPlayer> virtualPlayersList = new ArrayList<VirtualPlayer>();
    private final ArrayList<Dice> dicesList = new ArrayList<Dice>();
    public String name;
    private int turn = 0;
    private boolean isGameOver;

    public Referee(String name) {
        this.name = name;
    }

    public void initializeGame() {
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

    private void nextPlayer() {
        if (turn >= Game.MAX_PLAYERS)
            turn = 0;

        Player nextPlayer = playersList.get(turn);
        int random = (int) Math.floor(Math.random() * (Game.MAX_DICES));
        int score = dicesList.get(random).roll();
        int newScore = score + nextPlayer.getCurrentPoints();

        nextPlayer.setCurrentPoints(newScore <= 21 ? newScore : 0);

        if (nextPlayer.getCurrentPoints() == 21) {
            isGameOver = true;
            return;
        }
        turn++;
    }

    public void start() {
        initializeGame();
        turn = 0;
        isGameOver = false;
    }

}
