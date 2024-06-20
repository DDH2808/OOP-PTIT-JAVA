import java.util.Scanner;

public class Basic012 {
    public static int longestSortedSequence(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int start = 0;
        int maxSorted = 1;
        int max = 0;
        for(int i = 1; i < arr.length; i++){
            
            if( arr[i] >= arr[i-1]){
                
                maxSorted++;
            }
            else{
                if(maxSorted > max){
                    start = i - maxSorted;
                    max = maxSorted;
                }
                maxSorted = 1;
            }
        }
        if (maxSorted > max) {
            start = arr.length - maxSorted;
            max = maxSorted;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t--> 0){
            String[] inputLine = sc.nextLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(longestSortedSequence(arr));
        }
    }
}