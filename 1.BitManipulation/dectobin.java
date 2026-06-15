import java.util.*;

public class dectobin {
    public static void main(String[] args) {
        System.out.print("Enter the decimal number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }

        System.out.println(binary);
    }
}