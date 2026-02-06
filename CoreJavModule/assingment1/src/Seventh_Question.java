/*
WAP showing try, multi-catch and finally blocks.
 */


import java.util.Scanner;

public class Seventh_Question {

    public static void main(String[] args) {
        System.out.println("Enter The numbers to Divide");
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();


        String deno = sc.nextLine();

        try{
            int numerator = Integer.parseInt(num);
            int denominator = Integer.parseInt(deno);
            int answer = numerator/denominator;
            System.out.println("The answer = " + answer);
        }
        catch (ArithmeticException e){
            System.out.println("Denominator can't be Zero");
        }
        catch (Exception e){
            System.out.println("Invalid input. Please enter integers only.");
        }

        finally {
            sc.close();
        }

    }
}
