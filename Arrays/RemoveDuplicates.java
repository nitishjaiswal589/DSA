import java.util.Scanner;

public class RemoveDuplicates {
    // Remove duplictaes from the sorted array
    public int remove_duplicate(int[] nums) {
        int k = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[k]) {
                k++;
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
            }
        }
        return k + 1;
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

            RemoveDuplicates obj = new RemoveDuplicates();

            int result = obj.remove_duplicate(nums);
            System.out.print("No. of k Distinct Elements: ");
            System.out.print(result);
        }
    }
}