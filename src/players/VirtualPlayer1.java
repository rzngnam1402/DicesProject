package players;

public class VirtualPlayer1 extends VirtualPlayer {
    public VirtualPlayer1() {
        super();
        this.playerName = "Virtual Player 1";
    }

    @Override
    public void showDefeat() {
        System.out.println("Virtual Player 1: OMG, I lost :<");
    }
}
