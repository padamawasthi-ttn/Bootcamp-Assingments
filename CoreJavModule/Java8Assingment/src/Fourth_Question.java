/*
Write a program to implement constructor reference
 */
//define functional interface
@FunctionalInterface
interface CarFactory{
    Car create(String color, String engineType) ;
}
//defining method have same constructor as of interface abstract method
class Car{
    String color;
    String engineType ;

    Car(String color, String engineType){
        this.color=color;
        this.engineType=engineType;
    }

    void Display(){
        System.out.println(color + "  "+ engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}

public class Fourth_Question {
    public static void main(String[] args) {
        //Constructor Reference
        CarFactory factory= Car::new;

        //getting car from factory
        Car c1 = factory.create("Black","Diesel");
        Car c2= factory.create("Red","petrol");

        System.out.println(c1);
        System.out.println(c2);
    }
}
