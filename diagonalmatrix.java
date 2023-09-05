public class diagonalmatrix {
    public static int diagonal(int n[][]){//o(n^2)
        int sum=0;
        for(int i=0; i<n.length; i++){
            for(int j=0; j<n[0].length;j++){
                if(i==j)
                {
                    sum=sum +n[i][j];
                    
                }
                else if((j+i)==n.length-1){
                    sum=sum+n[i][j];
                    

                }

            }
        }
        
        return sum;
    }
        public static void main(String args[]){
            int n[][]={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                     {13,14,15,16}} ;

System.out.println(diagonal(n));
    }
    
}
