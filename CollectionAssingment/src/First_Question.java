/*
Write Java code to define List.
Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class First_Question {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(4.5);
        list.add(6.5);
        list.add(8.3);
        list.add(6.3);
        list.add(10.2);

        Iterator<Double> itr = list.iterator();

        double sum=0.0;

        //Iterating in list and Calculating Sum
        while(itr.hasNext()){
            sum = sum + itr.next();
        }
        System.out.println("Sum of Number is = "+ sum);
    }
}
