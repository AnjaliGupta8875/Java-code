public class butterfly {
    /**
     * @param n
     */
    public static void Butterfly(int n){
        //1st half
        for(int i=1; i<=n; i++)
        { //stars-i
            for (int j=1; j<=i;j++){
                    System.out.print("*");
            }
            //space - 2*(n-i)
            for (int j=1; j<=2*(n-i);j++){
                    System.out.print(" ");
            }
            //stars-i
         for(int j=1; j<=i; i++){
          
                    System.out.print("*");
           }
            
        
        System.out.println();
        }
        for(int i=n; i>=1; i--){
        
            for (int j=i; j<=i;j++){
                
                    System.out.print("*");
                    }
                    for(int j=1; j<=2*(n-i); j++){
                        System.out.print(" ");
                    }
        for(int j=1; j<=i;j++){
            
    System.out.print("*");
            }
          System.out.println();
        }
    }
    public static void main(String args[]){
        Butterfly(5);
    }
    
}
