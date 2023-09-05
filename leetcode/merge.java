import java.util.Arrays;

public class merge {

    


   public static void main (String args[]){
    int a[]={1,2,3,9};
    int b[]={4,5,6,7};
    
    int i=0, j=0;
    int l1=a.length;
    int l2=b.length;
    int[]c= new int [l1+l2];
    
    
    
    for(int k=0; k<l1+l2; k++){
        if(i<l1){
            c[k]=a[i++];
        }
        else {
        c[k]=b[j++];}

    }
    for(int k=0; k<l1+l2; k++){
    
   Arrays.sort(c);
        
    System.out.print(c[k]+" ");
    }
    

    

}
}