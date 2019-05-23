import java.util.ArrayList;

/**
 * Player
 */
public class Player {
    private String name;
    private double credit;

    public Player(String name, double credit) {
        this.name = name;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Player [credit = " + credit + ", name = " + name + "]";
    }
}