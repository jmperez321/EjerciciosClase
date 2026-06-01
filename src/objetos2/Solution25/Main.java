package objetos2.Solution25;

import java.util.*;

class Coords {
    int x, y;
}

class Player {
    String name;
    Coords position = new Coords();
    int score;
}

class Game {
    int width;
    int height;
    Player player1 = new Player();
    Player player2 = new Player();
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Game game = new Game();

        game.width = sc.nextInt();
        game.height = sc.nextInt();

        game.player1.name = sc.next();
        game.player1.score = sc.nextInt();
        game.player1.position.x = sc.nextInt();
        game.player1.position.y = sc.nextInt();

        game.player2.name = sc.next();
        game.player2.score = sc.nextInt();
        game.player2.position.x = sc.nextInt();
        game.player2.position.y = sc.nextInt();


        System.out.println("P1:" + game.player1.name + " #" + game.player1.score + " {" + game.player1.position.x + ", " + game.player1.position.y + "}");
        System.out.println("P2:" + game.player2.name + " #" + game.player2.score + " {" + game.player2.position.x + ", " + game.player2.position.y + "}");
    }
}
