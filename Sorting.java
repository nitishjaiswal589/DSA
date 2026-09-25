import java.util.Scanner;

public class Sorting {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before sorting: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        selectionSort(arr);

        System.out.println("\nAfter sorting: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}