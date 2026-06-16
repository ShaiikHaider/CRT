// import java.util.*;


// public class perfectsquare {
//     public static void main(String[] args) {
//         System.out.print("Enter the number : ");
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();

//         int root = (int)Math.sqrt(n);
//         if(root*root == n)
//         {
//             System.out.println("it is perfect square");
//         }
//         else{
//             System.out.println("NOT  a perfect");
//         }

//     }
    
// }


import java.util.Scanner;

public class PerfectSquareBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int low = 1, high = n;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            long square = (long) mid * mid;

            if (square == n) {
                found = true;
                break;
            } else if (square < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found)
            System.out.println("Perfect Square");
        else
            System.out.println("Not a Perfect Square");
    }
}