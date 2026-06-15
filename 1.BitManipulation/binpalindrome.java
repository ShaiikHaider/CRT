import java.util.*;

public class binpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String binary = Integer.toBinaryString(n);
        String rev = new StringBuilder(binary).reverse().toString();

        System.out.println(binary.equals(rev));
    }
}