public class swapping {
    
    public static void swap(int a,int b){
        int temp=a;
         a=b;
         b=temp;
         System.out.println("after swapping a is"+a);
         System.out.println("after swapping b is"+b);
                 
    }
    public static void main(String args[]){
        int a=5;
        int b=6;
        
        
        swap(a,b);
        
    }
}
