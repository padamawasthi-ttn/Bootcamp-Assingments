import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of objects of following class:

      class Employee{
      String fullName;
      Long salary;
      String city;
      }

Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.

Note: Full name is concatenation of first name, middle name and last name with single space in between.
 */
class Employee{
    String fullName;
    double salary;
    String city;

    public Employee(String fullName, double salary,  String city) {
        this.salary = salary;
        this.fullName = fullName;
        this.city = city;
    }
}
public class Nine_Question {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul Kumar Singh", 4500.0, "delhi");
        Employee e2 = new Employee("Amit Verma", 6000.0, "mumbai");
        Employee e3 = new Employee("Rahul Sharma", 3000.0, "delhi");
        Employee e4 = new Employee("Neha Gupta", 4800.0, "delhi");
        Employee e5 = new Employee("Amit Kumar", 4200.0, "delhi");
        Employee e6 = new Employee("Sneha Patel", 7000.0, "ahmedabad");

        List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e6);


        List<String> filteredList= list.stream()
                .filter(e ->e.salary < 5000.0)
                .filter(e ->e.city.equalsIgnoreCase("Delhi"))
                        .map(e->  e.fullName.split(" ")[0])
                        .distinct()
                     .toList();

        System.out.println(filteredList);


    }
}
