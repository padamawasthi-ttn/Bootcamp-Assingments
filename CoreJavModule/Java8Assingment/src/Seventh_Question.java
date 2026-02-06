
/*
Create and access default and static method of an interface.
 */
//interface with default and static method
interface Calc{
    default int addition(int a, int b){
        return a+b;
    }
    static int subtraction(int a, int b){
        return a-b;
    }
}
//empty class implementing interface
class Calculate implements Calc{

}
public class Seventh_Question {
    public static void main(String[] args) {
        //static Method OF interface
        System.out.println(Calc.subtraction(54,26));

        //default method of interface
        Calculate c= new Calculate();
        System.out.println(c.addition(54,29));
    }
}

