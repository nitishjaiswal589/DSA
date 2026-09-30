import java.util.Scanner;

public class Container_Water {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxarea = 0;
        while(left < right) {
            if(height[left] < height[right]) {
                maxarea = Math.max(height[left] * (right - left) , maxarea);
                left++;
            }
            else {
                maxarea = Math.max(height[right] * (right - left) , maxarea);
                right--;
            }
        }
        return maxarea;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            //Input Array Size
            int n = sc.nextInt();

            int[] height = new int[n];

            //Input Array Elements
            for(int i = 0; i < n; i++) {
                height[i] = sc.nextInt();
            }

            Container_Water obj = new Container_Water();
            int result = obj.maxArea(height);

            System.out.print("MaxArea of the Container with most water: ");
            System.out.print(result);
        }
    }
}