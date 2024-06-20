import java.util.Scanner;

public class STRING005 {
    public static boolean isPangram(String str){
        boolean[] arr = new boolean[26];
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int index = c - 'a';
            arr[index] = true;
        }
        for (boolean b : arr) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        while (s-- > 0) {
            String str = sc.next();  
            str = str.toLowerCase();
            boolean isPangram = isPangram(str);
            System.out.println(isPangram);          
        }
    }
}