/*
Write the following a functional interface and implement it using lambda:

1. To check whether the first number is greater than second number or not, Parameter (int ,int ) Return type boolean

2. Increment the number by 1 and return incremented value Parameter (int) Return int

3. Concatination of 2 string Parameter (String , String ) Return (String)

4. Convert a string to uppercase and return . Parameter (String) Return (String)
 */
//defining 4 Functional Interfaces
@FunctionalInterface
interface GreaterNumber{
    boolean isGreater (int first, int second ) ;
}
@FunctionalInterface
interface IncrementValue{
    int increment (int value) ;
}
@FunctionalInterface
interface StringConcat{
    String concat (String first, String second) ;
}
@FunctionalInterface
interface UpperCase{
    String toUpperCase (String value);
}
//implementing all these using lambda
public class Fisrt_Question {
    public static void main(String[] args) {
        GreaterNumber check= (a,b) -> a>b;
        IncrementValue increase= (a) -> ++a;
        StringConcat join  = (a,b) -> a+b;
        UpperCase upper = (a) -> a.toUpperCase();


        //use of all interfaces
        System.out.println(check.isGreater(10, 5));
        System.out.println(increase.increment(5));
        System.out.println(join.concat("Hello ", "World"));
        System.out.println(upper.toUpperCase("java"));


    }
}
