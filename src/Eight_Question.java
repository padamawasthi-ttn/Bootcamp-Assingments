import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
WAP to produce NoClassDefFoundError and ClassNotFoundException exception
 */
class Test{
    static {
        int a=5/0;
    }
    public static void display(){
        System.out.println("This Is static method of test class");
    }
}
public class Eight_Question {
    public static void main(String[] args) {
        try{
            Class.forName("NoClassExsist");

        }
        catch (ClassNotFoundException e){
            System.out.println("This Is ClassNotFoundException");
            System.out.println(e);
        }
        try{
            Test.display();
        }catch (Throwable e){}
        try {
            Test.display();
        }catch (Throwable e){
            System.out.println("this is noClassDefFoundError");
            System.out.println(e);
        }
    }

}
