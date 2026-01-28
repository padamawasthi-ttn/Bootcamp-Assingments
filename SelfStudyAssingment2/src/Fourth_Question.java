/*
Write a program to show application of Factory Design Pattern.
 */
interface Shape{
    void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

// factory class
class ShapeFactory{
    public static Shape getShape (String shapeType){
        if(shapeType == null ){
            return null;
        }
        else if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}


//using factory
public class Fourth_Question {
    public static void main(String [] args) {
        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}

