import java.util.Scanner;

class Planet {
    private String name;
    private double mass;
    private double radius;
    public static double G = 6.67300e-11;

    public Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public Planet(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    public static double getG() {
        return G;
    }

    public double calculateSurfaceGravity(){
        return (G * mass) / (radius * radius);
    }

}
public class ELAB2314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Planet ht = new Planet(sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        Planet td = new Planet(5.976e+24, 6.37814e+6);
        double  khoiluong = sc.nextDouble();
        double yourweight = (khoiluong * ht. calculateSurfaceGravity()) / td. calculateSurfaceGravity();
        System.out.printf("Your weight on %s is %.2f", ht.getName(), yourweight);

    }
}