import java.util.*;

public class zerostoend{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ebter size: ");
        int n = s.nextInt();

        int arr[] = new int[n];

        System.out.println("enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt(); 
        }

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j] = temp;

                j++;
            }
        }
        for(int x:arr){
            System.out.print(x + " ");
        }

    }
}
