/*
Using (instance) Method reference create and apply add and subtract method
and using (Static) Method reference create
and apply multiplication method for the functional interface created
 */
//defining functional interfaces
@FunctionalInterface
interface Operation{
    int calculate (int a, int b) ;
}
//defining class that have method implementation same as interface
class Calculator{
    int add(int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
}
public class Second_Question {
    public static void main(String[] args) {
        //static method reference
        Operation multiplication = Calculator::multiplication;

        //instance reference addition
        Calculator calc= new Calculator();
        Operation addition= calc::add;

        //instance reference Subtraction
        Operation subtraction= calc::sub;

        System.out.println(multiplication.calculate(4,5));
        System.out.println(addition.calculate(45,40));
        System.out.println(subtraction.calculate(90,60));


    }
}
