import java.util.Scanner;

public class PerfectSquareAndPerfect {
    static boolean isPerfectSquare(int n) {
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }

    static boolean isPerfectNumber(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return n > 1 && sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(), R = sc.nextInt();
        for (int i = L; i <= R; i++) {
            if (isPerfectSquare(i) && isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
