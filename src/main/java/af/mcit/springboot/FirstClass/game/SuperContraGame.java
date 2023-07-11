package af.mcit.springboot.FirstClass.game;

public class SuperContraGame implements GamingConsole{
    public void up(){
        System.out.println("SuperContraGame go Up!");
    }
    public void down(){
        System.out.println("SuperContraGame go Down!");
    }
    public void left(){
        System.out.println("SuperContraGame go Left!");
    }
    public void right(){
        System.out.println("SuperContraGame go Right!");
    }
}
