import java.util.Scanner;
public class Basic005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for(int i = 0; i < s; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();
            int num5 = sc.nextInt();
            int num = num1 + num2 + num3 + num4 + num5;
            System.out.println(num);
     }
 }
}

