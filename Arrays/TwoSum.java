import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == second) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        int target = sc.nextInt();

        Solution obj = new Solution();

        int[] result = obj.twoSum(nums, target);

        // Print result
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}