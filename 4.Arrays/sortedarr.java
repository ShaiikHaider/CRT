import java.util.*;

public class sortedarr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;

            }
        }

        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Not sorted");
        }

    }
}
