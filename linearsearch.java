public class linearsearch {
    public static int linear_search(int n[],int key){
        for(int i=0; i<n.length;i++){
            if(n[i]==key){
                return i;

            }
        
        }
        return -1;
        
    }
    public static void main(String args[]){

    
        int n[]={2,4,6,8,3,7,10,12,14,16};
        int key =14;
         int index =linear_search(n, key);
         
       if(index==-1){
            System.out.println("not found");

        }
        else{
    
        
        System.out.println("key is at index"+index); 
        

    }}}


