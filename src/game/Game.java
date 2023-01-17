package game;

import players.Player;
import referee.Referee;

public class Game {
    /**
     *  Play the game with following sequential steps:
     *  1. Roll dice
     *  2. Update score of current player based on dice value from above step.
     *  3. Switch current player.
     *  4. Repeat steps from 1 until someone's score is 21.
     *  5. Outside above loop, check which player has higher score. Display winner.
     */
    public static int MAX_PLAYERS = 4;
    public static int MAX_DICES = 4;
    public static void main(String[] args) {
        // initialize ref
        Referee ref = new Referee("Giang Nam");

        ref.start();
    }
}
