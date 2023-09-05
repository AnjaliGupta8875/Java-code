public class Power_oF_Two_Or_NOT {
    public static boolean isPower(int n){
return (n &(n-1))==0;
    }
    public static void main(String args[]){
    System.out.println(isPower(8));
    }
}
