import java.util.Optional;

/*
Write a program to showcase the use of optional classWrite a program to showcase the use of optional class
 */
public class Eight_Question {
    public static void main(String[] args) {

        String name="Padam";
        String nullName=null;

        //Creating Optional Class
        Optional<String> optName= Optional.of(name);
        Optional<String> optNull= Optional.ofNullable(nullName);


        //Checking Presence Of Value
        System.out.println("IsOptName Present Or Not =" + optName.isPresent());
        System.out.println("IsOptNull Present Or Not =" + optNull.isPresent());

        // Getting value safely
        System.out.println("Name: " + optName.get());

        // Using orElse (default value)
        System.out.println("Null Name: " + optNull.orElse("Default Name"));

        // Using ifPresent
        optName.ifPresent(n -> System.out.println("Length of name: " + n.length()));


    }
}
