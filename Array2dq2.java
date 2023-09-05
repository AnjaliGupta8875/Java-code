public class Array2dq2 {
    public static int sum_of(int n[][]){
        int sum=0;
    
            for(int j=0; j<n[0].length; j++){
                sum=sum+n[1][j];
            }
            return sum;
        }

    
     public static void main(String[] args) {
        int n[][]={{1,4,9},
                   {11,4,3},
                   {2,2,3}};
                   System.out.println(sum_of(n));

    }
    
}
