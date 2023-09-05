//import java.util.*;
public class binarysearch {
    public static int Binarysearch(int n[],int key){
        int start=0;
        int end=n.length-1;
        

        for(int i=0; i<=n.length;i++){
            while(start<=end)
            {
                int mid =(start+end)/2;
                if(n[mid]==key){
                    return mid;

                }
                
                 if(n[mid]<key){
                    start=mid +1;
                }
                else{
                    end=mid -1;
                }
            }}
            return -1;
        
        }
        public static void main(String args[]){
            int n[]={2,4,6,8,10,12,14,16};
           int key=8;
           System.out.println(Binarysearch(n, key));
            }
        }
    

