import java.util.Scanner;

public class Basic007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        while (s-- > 0) {
            int year = sc.nextInt();
            if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                System.out.println(year + " : Leap-year");
            }
            else {
                System.out.println(year + " : Non Leap-year");
            }
        }
    }
}
