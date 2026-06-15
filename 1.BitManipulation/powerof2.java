import java.util.*;

public class powerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int n = sc.nextInt();

        System.out.println(n > 0 && (n & (n - 1)) == 0);
    }
}