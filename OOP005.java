import java.util.Scanner;

abstract class Shape{
    public String name;

    public Shape (String name){
        this.name = name;
    }

    abstract double calculateArea();

    public void displayInfo(){
        System.out.printf("Shape:%s|Area:%.2f\n", name, calculateArea());
    }
}

class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(String name, double width, double length){
        super(name);
        this.width = width;
        this.length =length;
    }

    @Override
    double calculateArea(){
        return length * width;
    }

}

class Circle extends Shape{
    private double radius;

    public Circle (String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }

}


public class OOP005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            
            String shapeType = scanner.next();
    
            if (shapeType.equals("Rectangle")) {
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                Rectangle r = new Rectangle("Rectangle" , length, width);
                r.calculateArea();
                r.displayInfo();  
            } else if (shapeType.equals("Circle")) {
                double radius = scanner.nextDouble();
                Circle c = new Circle("Circle", radius);
                c.calculateArea();
                c.displayInfo();  
            } 
        
        } 
    }
}