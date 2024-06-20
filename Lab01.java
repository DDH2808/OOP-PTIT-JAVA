import java.util.Scanner;

public class Lab01 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        while(s-- > 0){
            int a = sc.nextInt();
            String b = sc.next();
            int c = sc.nextInt();
            int result;
            switch (b) {
                case "+":
                    result = a + c;
                    break;
                case "-":
                    result = a - c;
                    break;
                case "*":
                    result = a * c;
                    break;            
                default:
                    throw new IllegalArgumentException("Phép toán không hợp lệ");
            }
            System.err.println(result); 
        }            
    }
}
