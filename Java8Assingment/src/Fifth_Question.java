/*
Implement following functional interfaces from java.util.function using lambdas:

1. Consumer
2. Supplier
3. Predicate
4. Function
 */

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
public class Fifth_Question {
    public static void main(String[] args) {
        //Predicate Interface
        Predicate<Integer> checkEven= (a) -> a%2 ==0;

        //Supplier Interface
        Supplier<Double> getOTP= ()-> {
            return Math.random()*10000;
        } ;

        //Consumer Interface
        Consumer<String> consume = (s)-> System.out.println("You Entered"+s);

        //Function Interface
        Function<Integer , Integer> square= (a) -> a*a;

        //Predicate
        System.out.println(checkEven.test(3600));
        //Supplier
        System.out.println(getOTP.get());
        //Consumer
        consume.accept("Hello By Padam");
        //Function
        System.out.println(square.apply(25));

    }




}
