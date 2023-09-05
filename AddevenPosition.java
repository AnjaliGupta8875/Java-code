import java.util.*;

public class AddevenPosition {
    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int n= sc.nextInt();
 int evensum=0 ;int oddsum=0;
    
    //System.out.println(count);
    for (int i = 0; i < String.valueOf(n).length(); i++) {
        int digit = Character.getNumericValue(String.valueOf(n).charAt(i));
        if (i % 2 == 0) {
            evensum += digit;
        } else {
            oddsum += digit;
        }}
        System.out.println("Sum of even position numbers: " + evensum);
        System.out.println("Sum of odd position numbers: " + oddsum);
    
}}
