import java.util.Scanner;

public class STRING004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        while (a-- > 0) {
            String s = sc.nextLine();
            StringBuffer stringBuffer = new StringBuffer(s);
            System.out.println(stringBuffer.length());
        }
    }
}