import java.util.Scanner;

public class RemoveElement{
    public int removeElement(int[] nums, int val) {
        int k = nums.length -1;
        // Skip the element which is same as val from end
        while(k >= 0 && nums[k] == val) {
            k--;
        }
        
        for(int i = 0; i <= k; i++) {
            if(nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k--;

                while(k >= i && nums[k] == val) {
                    k--;
                }
            }
        }
        return k+1;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            // No.of Elements to take as an input
            int n = sc.nextInt();

            int[] nums = new int[n];

            // Input array elements
            for(int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            // Input target
            int val = sc.nextInt();

            RemoveElement obj = new RemoveElement();

            int result = obj.removeElement(nums, val);

            System.out.print("No. of Elements: ");
            System.out.print(result);
        }
    }
}