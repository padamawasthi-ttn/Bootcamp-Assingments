import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Create a User class with fields:  firstname, lastname, age, phonenumber.
Write a program which accepts values of user fields from commandline, create object and append that to a text file.
After every user creation the program should prompt: "Do you want to continue creating users? (Type QUIT to exit)" and keep on accepting values and writing to file unitl user quits.

 */
class User{
    private String firstname;
    private String lastname;
    private int age;
    private String phonenumber;

    public User(String firstname, String lastname, int age, String phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
public class Second_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            try{
                //Reading User Input
                String  firstname= sc.nextLine();

                System.out.print("Enter First Name: ");
                String firstName = sc.nextLine();

                System.out.print("Enter Last Name: ");
                String lastName = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = Integer.parseInt(sc.nextLine());

                System.out.print("Enter Phone Number: ");
                String phoneNumber = sc.nextLine();

                // Create User object
                User user = new User(firstName, lastName, age, phoneNumber);

                //  Append user data to file
                try (FileWriter fw = new FileWriter("users.txt", true)) {
                    fw.write(user.toString());
                    fw.write(System.lineSeparator());
                }

                // Ask user whether to continue
                System.out.print("Do you want to continue creating users? (Type QUIT to exit): ");
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("QUIT")) {
                    break;
                }
            }
            catch(IOException e){
                System.out.println("File error occured");
            }
            catch ( NumberFormatException e){
                System.out.println("Invalid Age . Please Enter A number");
            }
        }

        sc.close();
        System.out.println("Program Finished");
    }
}
