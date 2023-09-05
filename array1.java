import java.util.*;
public class array1 {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        int size=sc.nextInt();
        int n[]=new int[size];
        // input
for(int i=0;i<size; i++){
    n[i]=sc.nextInt();

}
//output
for(int i=0; i<size; i++){
    System.out.println(n[i]);
}


    }
}
