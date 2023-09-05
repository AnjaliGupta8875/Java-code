 //import java.util.*;
public class ritik{
    public static boolean rangpr(int n){
        boolean rangpr =true;
        for(int i = 2;i<=n-1;i=i+1){
            if(n%i==0){
                 rangpr = false;
                
            }
        }
        return rangpr;
       
        // System.out.println(er);
    }
    public static void prime(int c){
        for(int i =2;i<=c;i=i+1){
            if(rangpr(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
            prime(20);
    }
}
