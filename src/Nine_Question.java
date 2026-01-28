
/*
Create a custom exception that do not have any stack trace.
 */


import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;   // disables stack trace
    }
}
public class Nine_Question {
    public static void main(String[] args) throws InvalidAgeException{
        System.out.println("Enter the age to check you are allowed to vote or not");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try{
            if(age < 18){
                throw new InvalidAgeException("Not Eligible Right Now");
            }
            else{
                System.out.println("Yes , You Are Eligible Now To Vote");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
