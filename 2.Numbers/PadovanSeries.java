import java.util.*;

public class PadovanSeries {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


    int n = sc.nextInt();

    int a = 1, b = 1, c = 1;

    if (n >= 1) System.out.print(a + " ");
    if (n >= 2) System.out.print(b + " ");
    if (n >= 3) System.out.print(c + " ");

    for (int i = 4; i <= n; i++) {
        int next = a + b;
        System.out.print(next + " ");

        a = b;
        b = c;
        c = next;
    }

    
}


}
