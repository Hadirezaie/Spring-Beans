package af.mcit.springboot.FirstClass.game;

public class PacmanGame implements GamingConsole{
    public void up(){
        System.out.println("PacmanGame go Up!");
    }
    public void down(){
        System.out.println("PacmanGame go Down!");
    }
    public void left(){
        System.out.println("PacmanGame go Left!");
    }
    public void right(){
        System.out.println("PacmanGame go Right!");
    }
}
