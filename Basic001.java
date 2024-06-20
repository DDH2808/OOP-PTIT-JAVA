import java.util.Scanner;

public class Basic001{
	public static void main(String[] args) {
   		Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for(int i = 0; i < s; i++){
            String name = sc.next();
            System.out.println(name);
        }
	}
}