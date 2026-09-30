import java.util.Scanner;

public class RemoveDuplicates_II{
    
    public int remove_duplicate(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(j < 2 || nums[i] != nums[j-2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
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

            RemoveDuplicates_II obj = new RemoveDuplicates_II();
            int result = obj.remove_duplicate(nums);
            System.out.print("Size of array after removing duplicate values at most twice: ");
            System.out.print(result);
        }
    }
}