public class occuranceInteger {
    public static boolean integer(int n[]){
        
for(int i=0; i<n.length;i++){
    for(int j=i+1; j<n.length; j++){
        if(n[i]==n[j])
        {
    return true;
        }}}
    
        
    return  false;

    }
    public static void main (String args[]){
int n[]={2,4,6,8,10,};
  System.out.println( integer(n));
    }
    
}
