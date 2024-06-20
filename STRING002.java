import java.util.Scanner;

public class STRING002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(isSubstring(s1, s2));
        }
        sc.close();
    }
    public static boolean isSubstring(String s1, String s2) {
        return s1.contains(s2);
    }
}