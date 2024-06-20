import java.util.Scanner;

public class Basic009{
    public static int quadrant(double x, double y) {
        if (x == 0 || y == 0) {
            return 0;
        } else if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        while(s-- > 0){
            Double x = sc.nextDouble();
            Double y = sc.nextDouble();
            int quadrant = quadrant(x, y);
            System.out.println(quadrant);
        }
    }
}