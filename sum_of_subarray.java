public class sum_of_subarray {
        public static void maxsubArray(int n[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<n.length;i++){
            int start=i;
            for(int j=i; j<n.length; j++){
                int end=j;
                currsum=0;
                for(int k=start; k<=end; k++){
        currsum+=n[k];
                }
               // System.out.println(currsum);
       
    System.out.println(currsum);
    if(maxsum<currsum){
        maxsum=currsum;

    }
   
}

    }
System.out.println("max sum"+maxsum);}
    public static void main (String args[]){
        int n[]={5,4,-1,7,8};
        maxsubArray(n);
        
    }
    
}


