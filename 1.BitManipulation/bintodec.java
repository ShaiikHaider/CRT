import java.util.*;

public class bintodec {
    public static void main(String[] args) {
        System.out.print("Enter the decimal value : ");
        Scanner sc = new Scanner(System.in);

        String binary = sc.next();
        int decimal = Integer.parseInt(binary, 2);

        System.out.println(decimal);
    }
}