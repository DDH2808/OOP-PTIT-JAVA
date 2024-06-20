import java.util.Scanner;

class Point{
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double slope(Point other){
        if (this.x == other.x) {
            // Trả về -1 nếu hai điểm có cùng tọa độ x
            return -1;
          } else {
            // Sử dụng công thức để tính độ dốc
            return (double) (this.y - other.y) / (this.x - other.x);
          }
    }
}

public class OOP009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        while(s-- > 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            System.out.println(p1.slope(p2));
        }

    }
}
