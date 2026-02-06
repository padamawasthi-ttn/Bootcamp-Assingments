/*
Given the following class

Employee class{ Double Age; Double Salary; String Name}

Design the class in such a way that the default sorting should work on firstname and lastname.

Also, Write a program to sort Employee objects based on salary using Comparator.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
    String firstName;
    String lastName;
    Double age;
    Double salary;


    public Employee(String firstName, String lastName, Double age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    //overriding sorting logic
    @Override
    public int compareTo(Employee other){
        int firstNameCompare = this.firstName.compareTo(other.firstName);

        //if first name are not same it sort based on first name
        if(firstNameCompare != 0 ) {
            return firstNameCompare;
        }

        //2 . if first name are smae compare based on last name
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1 , Employee e2){
        return e1.salary.compareTo(e2.salary);
    }
}
public class Second_Question {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Padam" , "Awasthi" , 25.0, 50000.));
        list.add(new Employee("Saurabh" , "Singh" , 25.0, 2000.0));
        list.add(new Employee("Aishwarya" , "Arora" , 30.0, 6000.0));

        //Default Sorting Based On Names
        Collections.sort(list);
        System.out.println("Default Sorting Oredr Based On Names");
        for(Employee e : list){
            System.out.println(e);
        }

        // Sorting by salary
        Collections.sort(list, new SalaryComparator());
        System.out.println("\nSorting by Salary:");
        for(Employee e : list){
            System.out.println(e);
        }

    }
}
