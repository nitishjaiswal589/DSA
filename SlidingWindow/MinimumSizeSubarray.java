import java.util.Scanner;

public class MinimumSizeSubarray {
    public int minSubArrayLen(int target, int[] nums) {
        int high = 0;
        int low = 0;
        int currsum = 0;
        int minlenwin = Integer.MAX_VALUE;
        while(high < nums.length) {
            currsum += nums[high];
            high++;
            while(currsum >= target) {
                minlenwin = Math.min(minlenwin , high - low);
                currsum -= nums[low]; 
                low++;  
            }
        }
        return minlenwin == Integer.MAX_VALUE ? 0 : minlenwin;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int target = sc.nextInt();
            int n = sc.nextInt();

            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            MinimumSizeSubarray obj = new MinimumSizeSubarray();
            int result = obj.minSubArrayLen(target , nums);

            System.out.print("Minimum length Subarray is: ");
            System.out.print(result);
        }
    }
} 