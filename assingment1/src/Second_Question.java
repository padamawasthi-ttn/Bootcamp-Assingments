//2 Write a program to read user input until user writes XDONE and then show the entered text by the user on command line



import java.util.Scanner;

public class Second_Question {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder inputText = new StringBuilder();
        String text;


        System.out.println("Enter text to display  (Write XDONE to finish)");

        while (true) {
            text = sc.nextLine();

            if (text.equalsIgnoreCase("XDONE")){
                break;
            }

            inputText.append(text).append("\n");
        }
        System.out.println("You Entered The Text");
        System.out.println(inputText.toString());

        sc.close();

    }


}
