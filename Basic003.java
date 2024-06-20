import java.util.Scanner;
public class Basic003 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.nextLine();
        while (s-- > 0) {
            String name = sc.nextLine();
            String greeting = "Hi " + name;
            System.out.println(greeting);
        }
    }
}