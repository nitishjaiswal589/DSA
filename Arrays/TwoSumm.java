import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumm {
    public int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            // if map conatins second then return it's index and current element index
            if(map.containsKey(second)) {
                return new int[]{map.get(second), i};
            }
            // Add the elements ans their index to the map
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int nums[] = new int[n];

            for(int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int target = sc.nextInt();

            TwoSumm obj = new TwoSumm();

            int[] result = obj.twosum(nums, target);

            System.out.println(Arrays.toString(result));
        }
    }
}