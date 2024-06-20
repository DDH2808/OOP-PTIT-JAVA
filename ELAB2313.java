import java.util.Scanner;

class Point {
    private double x;
    private double y;
    private double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double distance(Point other) {
        return Math.sqrt(Math.pow(other.getX() - x, 2) + Math.pow(other.getY() - y, 2) + Math.pow(other.getZ() - z, 2));
    }
}

class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double length() {
        return start.distance(end);
    }
}

public class ELAB2313 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point startPoint = null;
        Point[] points = new Point[10]; // assume max 10 points
        int numPoints = 0;

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String[] parts = line.split(" ");
            if (parts.length != 4) {
                System.out.println("invalid input");
                return;
            }
            String name = parts[0];
            double x = Double.parseDouble(parts[1]);
            double y = Double.parseDouble(parts[2]);
            double z = Double.parseDouble(parts[3]);
            Point point = new Point(x, y, z);
            points[numPoints++] = point;
            if (startPoint == null) {
                startPoint = point;
            }
        }

        if (numPoints < 2) {
            System.out.println("invalid input");
            return;
        }

        for (int i = 0; i < numPoints - 1; i++) {
            Point p1 = points[i];
            Point p2 = points[i + 1];
            if (p1.getX() == p2.getX() && p1.getY() == p2.getY() && p1.getZ() == p2.getZ()) {
                System.out.println("same point");
                return;
            }
            Line line = new Line(startPoint, p2);
            System.out.printf("Line %s%s: %.2f%n", name, p2.toString(), line.length());
        }
    }
}