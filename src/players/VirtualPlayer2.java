package players;

public class VirtualPlayer2 extends VirtualPlayer {
    public VirtualPlayer2() {
        super();
        this.playerName = "Virtual Player 2";
    }

    @Override
    public void showDefeat() {
        System.out.println("Virtual Player 2: huhuhu, I lost :((((");
    }
}
