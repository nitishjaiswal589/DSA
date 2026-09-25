import java.util.Scanner;

public class MergeSorting {
    public static void mergeSort(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }
        int mid = (low + high)/2;
        
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;

        // put elements in temp array in sorted order
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            }
            else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }
        // Copying remaining elements from left side
        while(left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }
        // Copying remaining elements from right side
        while(right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }
        // Copying temp back to original array
        for(int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: "); 
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: ");
        for(int values : arr) {
            System.out.print(values + " ");
        }

        mergeSort(arr, 0, n-1);

        System.out.println("After Sorting: ");
        for(int values : arr) {
            System.out.print(values + " ");
        }        
        sc.close();
    }
}
