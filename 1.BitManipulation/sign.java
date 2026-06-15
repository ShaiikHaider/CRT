import java.util.*;

public class sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values : ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((a ^ b) < 0);
    }
}