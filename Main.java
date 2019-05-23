/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player p = new Player("Franco", 500);


        System.out.println(game.bet(15) + "\n");
        System.out.println(p + "\n");
        System.out.println(game);
    }
}