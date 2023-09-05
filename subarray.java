//import java.util.*;
public class subarray {
    public static void subArray(int n[]){
        int ts=0;//ts ia for total subarray
for(int i=0;i<n.length;i++){
    int start=i;
for(int j=i; j<n.length;j++){
    int end=j;
    for(int k=start; k<=end;k++)
    {
        System.out.print(n[k]+" ");
    }
    ts++;
    System.out.println();
}
System.out.println();
    }
System.out.println("total no. of sub array"+ts);}
    public static void main (String args[]){
        int n[]={2,4,6,8,10};
        subArray(n);
        
    }
    
}
