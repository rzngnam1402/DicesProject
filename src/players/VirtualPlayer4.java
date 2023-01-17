package players;

public class VirtualPlayer4 extends VirtualPlayer {
    public VirtualPlayer4() {
        super();
        this.playerName = "Virtual Player 4";
    }

    @Override
    public void showDefeat() {
        System.out.println("Virtual Player 4: It was fun but I lost :((((");
    }
}
