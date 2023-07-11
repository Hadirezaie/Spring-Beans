package af.mcit.springboot.FirstClass.game;

public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("MarioGame go Up!");
    }
    public void down(){
        System.out.println("MarioGame go Down!");
    }
    public void left(){
        System.out.println("MarioGame go Left!");
    }
    public void right(){
        System.out.println("MarioGame go Right!");
    }
}
