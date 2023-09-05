public class transposeArray {
    public static void transpose(int n[][]){
        
for(int i=0;i<n.length;i++){
    for(int j=0; j<n[0].length; j++){
        System.out.print(n[i][j]=n[j][i]);
    }
    System.out.println();
}

    }
    public static  void main(String args[]){
        int n[][]={{4,6,9},
                    {3,2,73}};
        transpose(n);


    }
}
