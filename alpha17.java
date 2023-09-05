import java.util.*;
public class alpha17 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        
        int evensum =0;
        int oddsum =0;
        int choice ;
        int n;

        do{
     System.out.println("enter number:");
     n =sc.nextInt();
        
            if(n%2==0){
                evensum+=n;
            }
            else 
            {
                oddsum+=n;
            }
            System.out.println("Do you want to continue ? press 1 for yes press 0 for no ");
            choice= sc.nextInt();
        }
        while(choice==1);
      System.out.println("sum of even number is"+evensum);
      System.out.println("sum of odd number is "+oddsum);
    }

    
}
