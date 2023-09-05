import java.util.*;
public class alpha3 {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        float pencil = sc.nextFloat();
        float pen =sc.nextFloat();
        float eraser= sc.nextFloat();
        float bill = pencil+pen +eraser;
        System.out.println(" bill: "+bill);
        float total = bill+(0.18f*bill);
        System.out.println("total bill with gst is: " +bill);
    }
    
}
