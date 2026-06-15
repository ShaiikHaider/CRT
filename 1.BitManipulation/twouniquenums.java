import java.util.*;

public class twouniquenums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int xor = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            xor ^= arr[i];
        }

        int rightMostSetBit = xor & -xor;

        int x = 0, y = 0;

        for (int num : arr) {
            if ((num & rightMostSetBit) != 0)
                x ^= num;
            else
                y ^= num;
        }

        System.out.println(x + " " + y);
    }
}
