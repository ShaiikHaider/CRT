// import java.util.Scanner;

// public class neonnum {
//     public static void main(String[] args){
//         System.out.print("Enter the number : ");
//         Scanner s= new Scanner(System.in);
//         int num = s.nextInt();

//         int square = num*num;
//         int sum=0;

//         while(square>0){
//             sum=sum+square%10;
//             square = square/10;
//         }

//         if(sum==num){
//             System.out.println("It is a NEON number");
//         }
//         else{
//             System.out.println("NOT a neon number");
//         }
//     }
    
// }

public class NeonRange {
    public static void main(String[] args) {

        for (int n = 1; n <= 1000; n++) {

            int square = n * n;
            int sum = 0;

            while (square > 0) {
                sum += square % 10;
                square /= 10;
            }

            if (sum == n) {
                System.out.print(n + " ");
            }
        }
    }
}