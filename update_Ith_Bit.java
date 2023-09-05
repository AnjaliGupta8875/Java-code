public class update_Ith_Bit {
    public static int setIthBit(int n, int i){
        int bitmask=1<<i;
        return n|bitmask;

    }
    public static int clearIthBit(int n,int i){
        int bitmask= ~(1<<i);
        return n&bitmask;

    }
    public static int update(int n ,int i,int newbit){
         n=clearIthBit(n, i);
         int bitmask=newbit<<i;
         return n|bitmask;

    }
    public static void main(String args[]){
System.out.println(update(10,2,1));
    }
}
