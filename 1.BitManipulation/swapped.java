// import java.util.*;

// public class swapped {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;

//         System.out.println("Before Swap: " + a + " " + b);

//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;

//         System.out.println("After Swap: " + a + " " + b);
//     }
// }


import java.util.*;

public class swapped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values :" );

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " " + b);
    }
}
