import java.math.BigInteger;
import java.util.Scanner;

public class LAB01_BigInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String expression = sc.nextLine();

            String[] tokens = expression.split(" ");
            BigInteger num1 = new BigInteger(tokens[0]);
            String operator = tokens[1];
            BigInteger num2 = new BigInteger(tokens[2]);

            BigInteger result;

            switch (operator) {
                case "+":
                    result = num1.add(num2);
                    break;
                case "-":
                    result = num1.subtract(num2);
                    break;
                case "*":
                    result = num1.multiply(num2);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
            System.out.println(result);
        }
        sc.close();
    }
}
