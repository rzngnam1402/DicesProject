package referee;

import game.Game;
import players.*;

import java.util.ArrayList;

public class Referee {
    private final ArrayList<Player> playersList = new ArrayList<Player>();
    public String name;
    private final ArrayList<VirtualPlayer> virtualPlayerList = new ArrayList<VirtualPlayer>();
    private boolean isGameOver;

    public Referee(String name) {
        this.name = name;
    }

    public void start() {
        // initialize virtual players
        virtualPlayerList.add(new VirtualPlayer1());
        virtualPlayerList.add(new VirtualPlayer2());
        virtualPlayerList.add(new VirtualPlayer3());
        virtualPlayerList.add(new VirtualPlayer4());

        // initialize players
        Player player1 = new Player("Peter");
        Player player2 = new Player("Judy");

        // add players
        playersList.add(player1);
        playersList.add(player2);

        int virtualPlayerNumber = Game.MAX_PLAYERS - playersList.size();
        for (int i = 0; i < virtualPlayerNumber; i++) {
            playersList.add(virtualPlayerList.get(i));
        }
    }

}
