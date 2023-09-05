public class diagonalmatrix2 {
    public static int diagonal(int n[]){
        int sum=0 ,int i;
        for(int i=0;i<n.length; i++){
            sum+=n[i][i];
            if(i!=n.length-1-i)
                sum+=n[i][n.length-i-1];
            
        }
        return sum;
    }
    public static void main(String args[]){

    }
    
}
