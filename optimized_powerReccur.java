public class optimized_powerReccur {
    public static int optimised(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimised(x,n/2);
        int halfpower_sq=halfpower*halfpower;
        // n is odd
        if(n%2!=0){
            return x*halfpower_sq;
        }
        return halfpower_sq;
    }
    public static void main(String args[]){
System.out.println(optimised(2,9));
}
    
}
