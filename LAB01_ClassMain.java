import java.util.Scanner;

public class LAB01_ClassMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int countCharacter = s.length();
            String[] word = s.split(" ");
            int countWord = word.length;
            System.out.println(countCharacter + " " + countWord);
        }
        sc.close();
    }
}
