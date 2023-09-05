public class clear_Last_I_Bits {
    public static int clearlast(int n , int i){
int bitmask=(~0)<<i;//  or bitmask=-1<<i
return n&bitmask;

    }
    public static void main(String args[]){
        System.out.println(clearlast(15,2));
    }
}
