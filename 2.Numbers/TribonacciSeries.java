import java.util.*;

public class TribonacciSeries {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int a = 0, b = 0, c = 1;

    System.out.print(a + " " + b + " " + c + " ");

    for (int i = 4; i <= n; i++) {
        int next = a + b + c;
        System.out.print(next + " ");

        a = b;
        b = c;
        c = next;
    }

   
}


}
