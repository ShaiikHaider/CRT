import java.util.*;

public class identifyuniquenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= sc.nextInt();
        }

        System.out.println("The Unique number is : " + xor);
    }
}