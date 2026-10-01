import java.util.Scanner;

public class MaximumSubarray {
    public int maxSumArray(int[] nums) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum < 0) {
                maxsum = Math.max(maxsum , sum);
                sum = 0;
            }
            else {
                maxsum = Math.max(maxsum , sum);
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            // Input Array Size
            int n = sc.nextInt();

            int[] nums = new int[n];
            //Input Array Elements
            for(int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            MaximumSubarray obj = new MaximumSubarray();
            int result = obj.maxSumArray(nums);

            System.out.print("Maximum SubArray Sum: ");
            System.err.print(result);
        }
    }
}