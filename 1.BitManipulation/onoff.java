import java.util.*;

public class onoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number
        int k = sc.nextInt(); // bit position

        System.out.println("ON     : " + (n | (1 << k)));
        System.out.println("OFF    : " + (n & ~(1 << k)));
        System.out.println("TOGGLE : " + (n ^ (1 << k)));
        System.out.println("CHECK  : " + ((n & (1 << k)) != 0));
    }
}