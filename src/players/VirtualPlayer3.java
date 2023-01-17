package players;

public class VirtualPlayer3 extends VirtualPlayer {
    public VirtualPlayer3() {
        super();
        this.playerName = "Virtual Player 3";
    }

    @Override
    public void showDefeat() {
        System.out.println("Virtual Player 3: I can believe I lost :((((");
    }
}
