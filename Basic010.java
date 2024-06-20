import java.util.Scanner;

public class Basic010 {

    public static int swapDigitPairs(int n) {
        int result = 0;
        int multiplier = 1;

        while (n >= 10) {
            int digit1 = n % 10;
            n /= 10;
            int digit2 = n % 10;
            n /= 10;

            result += multiplier *(10 *digit1 + digit2);
            multiplier *= 100;
        }
        if(n != 0){
            result += multiplier * n;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int swappedNumber = swapDigitPairs(n);
            System.out.println(swappedNumber);
        }
    }
}