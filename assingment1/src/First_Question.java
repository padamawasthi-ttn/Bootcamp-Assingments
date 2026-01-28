//Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.


public class First_Question {
    static String firstName = "Padam";
    static String lastName = "Awasthi";
    static int age = 25;


    static{
        System.out.println("First name = " + firstName);
    }

    static void printLastName(){
        System.out.println("Last Name :" + lastName);
    }

    public static void main (String[] a){
        printLastName();

        System.out.println("Age" + age);
    }
}
