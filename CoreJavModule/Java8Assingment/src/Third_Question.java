/*
Implement multiple inheritance with default method inside interface.
 */
//defining 2 interfaces with same default method
interface Camera{
    default void start(){
        System.out.println("Camera Started");
    }
}
interface MusicPlayer{
    default void start(){
        System.out.println("Music Player Started");
    }
}
//class implementing both
class SmartPhone implements Camera, MusicPlayer{
    @Override
    public void start(){
        //we have to specify using super otherwise it stuck in diamond problem
        Camera.super.start();
        //we have to specify using super otherwise it stuck in diamond problem
        MusicPlayer.super.start();
    }
}
//using both at same time
public class Third_Question {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.start();
    }
}
