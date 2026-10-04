import java.util.*;

class MaximumavgSubarray {
    public double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        long maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(sum, maxSum);
        }
        return (double) maxSum / k;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            MaximumavgSubarray obj = new MaximumavgSubarray();
            double result = obj.findMaxAverage(nums, k);

            System.out.print("Maximum Average Subarray is: ");
            System.out.print(result);
        }
    }
}