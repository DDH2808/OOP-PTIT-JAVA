import java.lang.Math;
import java.util.Scanner;

class Point{
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
      }
    
    public int getY() {
        return y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    
    public double distanceTo(Point p) {
        double dx = (double) (this.x - p.getX());
        double dy = (double) (this.y - p.getY());
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class OOP004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        while ((s-- > 0)) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            Point point1 = new Point(x1, y1);
            Point point2 = new Point(x2, y2);

            point1.move(1, 1);

            double distance = point1.distanceTo(point2);

            System.out.printf("%.2f\n", distance);
        }
    }
}
