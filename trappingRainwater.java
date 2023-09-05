//import java.util.*;
public class trappingRainwater {
    public static int trapped_rainwater(int H[]){
//calculate left max boundary -array
int n=H.length;
int leftmax[]= new int [n];
leftmax[0]=H[0];
for(int i=1; i<H.length;i++){
    leftmax[i]=Math.max(H[i], leftmax[i-1]);
}

 //calculate right max boundary - array
 int rightmax[]= new int [n];
 rightmax[n-1]=H[n-1];
for(int i=n-2; i>=0;i--){
    rightmax[i]=Math.max(H[i], rightmax[i+1]);

}
int trappedwater=0;
 //loop
 for(int i=0;i<n; i++){
    //waterlevel=min(leftmax bound,rightmax bound)
    int waterlevel=Math.min(leftmax[i],rightmax[i]);
    trappedwater +=waterlevel-H[i];
//trapped water = waterlevel-H[i]
 }
 return trappedwater;
 
 
 
   }
    public static void main(String args[]){
        int H[]={4,2,0,6,3,2,5};
       System.out.println( trapped_rainwater(H));
        
    }
}
