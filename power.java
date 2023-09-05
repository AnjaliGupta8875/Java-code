public class power {
    public static double mypow(double x,int n){
    
        
        double pow=1;
        if(n<0){
            for(int i=n; i<1; i--){
                pow=1/(pow*x);
            }
        return pow;
        }
        else{
            for(int i=1; i<=n; i++){
                pow= (pow*x);
            }
            return pow;
            
    }
    public static void main(String args[]){
System.out.println(mypow(2,-3));
    }
    
}
