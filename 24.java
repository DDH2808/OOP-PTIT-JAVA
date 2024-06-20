import java.util.Scanner;

public class 24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] nums = s.split(" ");
            int sum = add(Integer.parseInt(nums[0]),Integer.parseInt(nums[1]));
            int difference = subtract(Integer.parseInt(nums[0]),Integer.parseInt(nums[1]));
            int quotient = divide(Integer.parseInt(nums[0]),Integer.parseInt(nums[1]));
            System.out.println(sum + " " + difference + " " + quotient);
        }
    }
    
    private static int add(int x, int y) {
        return x + y;
    }

    private static int subtract(int x, int y) {
        return x - y;
    }

    private static int divide(int x, int y) {
        if (y == 0) {
            return -1;
        } else {
            return x / y;
        }
    }
}