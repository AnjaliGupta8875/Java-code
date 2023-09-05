public class kadanesArray {
   /* public static void maxsubArray(int n[]){
        int currsum=0;
    
            int maxsum=Integer.MIN_VALUE;
            int prefix[]=new int[n.length];
            prefix[0]=n[0];
            for(int i=1; i<prefix.length; i++){
                prefix[i]=prefix[i-1]+n[i];
            }
            for(int i=0; i<n.length;i++){
                int start=i;
                for(int j=i; j<n.length; j++){
                    int end=j;
                    currsum=start==0 ?prefix[end]:prefix[end]-prefix[start-1];
    
                    
        if(maxsum<currsum){
            maxsum=currsum;
    
        }
       
    }
    
        }
    System.out.println("max sum"+maxsum);} */
    public static void kadanes(int n[]){
int ms=Integer.MIN_VALUE;
int cs=0;
for(int i=0; i<n.length; i++){
    cs=cs+n[i];
    if(cs<0){
        cs=0;
    }
    ms=Math.max(cs,ms);
}
System.out.println("our max subarray sum is:"+ms);
    }
        public static void main (String args[]){
            int n[]={-2,-3,4,-1,-2,1,5,-3};
            kadanes(n);
            
        }
        
    }
    
    
    

