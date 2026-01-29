import java.util.Arrays;
import java.util.List;

/*
Sum all the numbers greater than 5 in the integer list using streams
 */
public class Sixth_Question {
    public static void main(String[] args) {
        //Creating List
        List<Integer> list=Arrays.asList(12,56,24,1,36);

        //Creating Stream
        int total = list.stream()
                .filter(e -> e > 5)                           //filtering number greater than 5
                .mapToInt(e -> e)                              // it convert to int
                .sum();                                             //it is doing sum of values


        //printing result
        System.out.println("Sum of Elements Greater Than 5 = " + total);
    }
}
