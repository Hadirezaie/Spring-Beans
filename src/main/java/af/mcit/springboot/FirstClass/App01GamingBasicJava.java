package af.mcit.springboot.FirstClass;

import af.mcit.springboot.FirstClass.game.GameRunner;

import af.mcit.springboot.FirstClass.game.MarioGame;
import af.mcit.springboot.FirstClass.game.SuperContraGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var game= new MarioGame();
        var game= new SuperContraGame();
//        var game= new PacmanGame();
        var gameRunner= new GameRunner(game);
        gameRunner.run();
    }
}
