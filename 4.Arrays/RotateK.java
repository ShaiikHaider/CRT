import java.util.*;

public class RotateK {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = s.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("Enter k: ");
        int k = s.nextInt();

        k = k % n;

        int temp[] = new int[n];

        for(int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        for(int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.println("Rotated Array:");

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
