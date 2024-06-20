import java.util.Scanner;

public class Basic011{
    public static int minGap(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }

        int minGap = arr[1] - arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            int gap = arr[i + 1] - arr[i];
            if (gap < minGap) {
                minGap = gap;
            }
        }

        return minGap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 

        while (t-->0) {
            String[] inputLine = sc.nextLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(minGap(arr));
        }
        sc.close();
    }
}