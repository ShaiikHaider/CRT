import java.util.Scanner;

public class PronicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i * (i + 1) <= N; i++) {
            System.out.print(i * (i + 1) + " ");
        }
    }
}
