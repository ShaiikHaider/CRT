import java.util.*;


public class buzznum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = s.nextInt();

        if(n%10==7 | n%7==0){
            System.out.println("it is a buzz number");
        }else{
            System.out.println("not a buzz number");
        }

        
    }
    
}
