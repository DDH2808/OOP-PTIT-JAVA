import java.util.*;
public class EXCEPTION003 {
    public static boolean hasVowels(String str) {
    for (char c : str.toCharArray()) {
        if ("aeiouAEIOU".indexOf(c) != -1) {
            return true;
        }
    }
    return false;
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        scanner.nextLine(); // Thêm dòng này để bỏ qua dấu xuống dòng
        while (s-- > 0) {
            String str = scanner.nextLine();

            try {
                if (hasVowels(str)) {
                    System.out.println("String has vowels");
                } else {
                    throw new Exception("String not contain vowels");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
