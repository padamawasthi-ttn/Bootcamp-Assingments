/*
Create a class named Employee with fields firstname,lastname,age and designation.

The class should:

1. have all types of constructors to initialize the object

2. class should also have setter methods to update a particular field

3. Override its toString method to display a meaningful message using all these fields.
 */
class fifth_Question {
    public static void main(String[] args) {
        Employee e1=new Employee();

        Employee e2 = new Employee("Padam", "Awasthi", 25 , "SDET");

        Employee e3 = new Employee(e2);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);


    }
}

class Employee{
    private String firstname;
    private String lastname;
    private int age;
    private String designation;

    //default const
    public Employee() {
        this.firstname = "Not Set";
        this.lastname = "Not Set";
        this.age = 0;
        this.designation = "Not Assigned";
    }

    //parametrized constructor

    public Employee(String firstname, String lastname, int age, String designation) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.designation = designation;
    }

    //copy const
    public Employee(Employee e) {
        this.firstname = e.firstname;
        this.lastname = e.lastname;
        this.age = e.age;
        this.designation = e.designation;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }
}

