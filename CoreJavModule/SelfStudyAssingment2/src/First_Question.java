/*
Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
 */
enum House{
    SMALL(5000),
    MEDIUM(10000),
    LARGE(200000);

    private int price;

    //enum constructor
    House(int price){
        this.price = price;
    }

    //getter method
    public int getPrice(){
        return price;
    }
}
public class First_Question {
    public static void main(String[] args) {
        for (House h : House.values()){
            System.out.println(h + "house price is "+ h.getPrice());
        }
    }
}
