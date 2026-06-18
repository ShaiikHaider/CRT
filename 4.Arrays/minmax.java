import java.util.*;

public class minmax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the sizze of the array : ");
        int n = s.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements of array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int min = arr[0], max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("min element is : " + min);
        System.out.println("max element is : " + max);

    }
}