import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LAB01_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTestCases = sc.nextInt();
        for (int i = 0; i < numTestCases; i++) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = sc.nextInt();
            }
            int target = sc.nextInt();
            int[] result = twoSum(nums, target);
            if (result == null) {
                System.out.println("Not found");
            } else {
                System.out.println(result[0] + " " + result[1]);
            }
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
