package NasruPracticeforDSA.javaPractice.StringFunctions;



import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array of Values (0, 1, 2): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array using the two-pointer approach
        sortArray(arr);

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortArray(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid], move both pointers
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    // Move the mid pointer
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high], move high pointer
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
