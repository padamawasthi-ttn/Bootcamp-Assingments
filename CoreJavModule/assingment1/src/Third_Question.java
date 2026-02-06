/* 3) Write a java program to show following menu to the user:

*******Menu*******
1. Calculate Area of Circle
2. Calculate Circumference of a Circle
3. Exit.
Choose an option (1-3):

Take radius as user input.

Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static
*
* */

import java.util.Scanner;
public class Third_Question {

    static double calculateArea(double r) {
        return 3.14 * r * r;
    }

    static double calculateCircumference(double r) {
        return 2 * 3.14 * r;
    }

    public static void main(String[] args) {
        System.out.println("Select Option To Perform Operation \n");
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit.");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double radius =0;
        switch (choice) {
            case 1 :
                System.out.println("Enter Radius To Calculate Area Of Circle");
                radius =sc.nextDouble();
                System.out.println("The Area is = " + calculateArea(radius));
                break;

            case 2 :
                System.out.println("Enter Radius To Calculate Circumference Of Circle");
                radius = sc.nextDouble();
                System.out.println("The Circumference = " + calculateCircumference(radius));
                break;

            case 3:
                System.out.println("Thanks For Visit");
                System.exit(0);
        }

        sc.close();
    }
}
