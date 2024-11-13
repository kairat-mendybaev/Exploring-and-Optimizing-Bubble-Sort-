import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {


    public static void sort(int[] array) {
        boolean swapped;
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;  // If no elements were swapped, stop the algorithm
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int count = scanner.nextInt();

        int[] array = new int[count];

        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        sort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));

    }
}
