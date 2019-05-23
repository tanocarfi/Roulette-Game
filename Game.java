import java.util.Arrays;
import java.util.Random;

/**
 * Game
 */
public class Game {
    Player p = new Player("Franco", 500);
    private int[][] grid;
    private int[] redNumbers = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
    private int[] blackNumbers = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};
    private enum Color {
        GREEN,
        BLACK,
        RED;
    }

    public Game() {
        this.grid = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 },
        { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 }, { 28, 29, 30 }, { 31, 32, 33 }, { 34, 35, 36 } };
    }  
    
    //metodo che mi inserisce una puntata e incrementa o diminuisce il credito del Player 
    public String bet(int number) {
        String s1 = "Win";
        String s2 = "Lose";
        String s3 = "Il numero inserito è errato!";
        if (number >= 0) {
            for (int var : redNumbers) {
                if (var == number) {
                    if (number == random()) {
                        p.setCredit(500 * 36);
                        return s1;
                    } else {
                        p.setCredit(0);
                        return s2;}
                }
            }
            for (int var2 : blackNumbers) {
                if (var2 == number) {
                    if (number == random()) {
                        p.setCredit(500 * 36);
                        return s1;
                    } else {
                        p.setCredit(0);
                        return s2;
                    }
                }
            }
        }
        return s3;
    }

    //metodo che mi genera in modo casuale dei numeri compresi tra 0 e 36
    public int random() {
        Random random = new Random();
        int number = random.nextInt(37);
        return number;
    }
    
    //stampa della griglia di gioco.
    @Override
    public String toString() {
        String s = "";
        String s1 = "|        0       |\n";
        for (int i = 0; i < this.grid.length; i++) {
            for (int j = 0; j < this.grid[i].length; j++) {
                if (this.grid[i][j] <= 9) {
                    s += "| " + this.grid[i][j] + "  |";
                } else {
                    s += "| " + this.grid[i][j] + " |";
                }
            }
            s += "\n";
        }
        return s1 + s;
    }
}