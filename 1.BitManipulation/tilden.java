import java.util.Scanner;

public class tilden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value : ");
        int n = sc.nextInt();

        System.out.println(~n);
    }
    
}
