public class Get_Ith_Bit {
    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;

        } else{
            return 1;
        }

    }
    public static void main(String args[]){
        System.out.print(getIthBit(10,2));
    }
}
