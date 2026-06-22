import java.util.Scanner;

public class NelsonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean repunit = true;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 1) { repunit = false; break; }
            n /= 10;
        }
        System.out.println(repunit);
    }
}
