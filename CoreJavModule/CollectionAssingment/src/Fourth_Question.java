import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value
 */
class Employee{

    private String name;
    private int age;
    private String designation;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    // getters (optional but good practice)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    // override equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(designation, employee.designation);
    }

    //  override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    @Override
    public String toString() {
        return name + " | " + age + " | " + designation;
    }
}
public class Fourth_Question {
    public static void main(String[] args) {
        Map<Employee , Double> salaryMap = new HashMap<>();

        Employee e1 = new Employee("Padam" ,25,"Software Devloper"   );
        Employee e2 = new Employee("Saurabh" ,27,"Software Tester"   );
        Employee e3 = new Employee("Anand" ,30,"Software Devloper"   );

        salaryMap.put(e1 , 50000.0);
        salaryMap.put(e2, 6000.0);
        salaryMap.put(e3, 6500.0);

        //printing map entries
        for(Map.Entry<Employee , Double> entry : salaryMap.entrySet()){
            System.out.println(entry.getKey()+ " -> Salary = "+ entry.getValue());
        }
    }
}
