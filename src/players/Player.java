package players;

public class Player {
    protected String playerName;
    private int currentPoints;

    public Player() {

    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public int getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(int currentPoints) {
        this.currentPoints = currentPoints;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void showDefeat() {
        System.out.println(this.playerName + ": Oh no, I lost :<<<<");
    }

    @Override
    public String toString() {
        String playerName = this.playerName;
        return playerName + ": hehe, I won :>";
    }
}
