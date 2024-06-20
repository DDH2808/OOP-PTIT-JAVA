import java.util.Scanner;

public class STRING001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            String s = parts[0];
            int i = Integer.parseInt(parts[1]);
            System.out.println("The character at position " + i + " is " + s.charAt(i));
        }

    }
    public static char getCharacterAtIndex(String s, int i) {
        if (i >= 0 && i < s.length()) {
            return s.charAt(i);
        }
        return 0;
    }
}