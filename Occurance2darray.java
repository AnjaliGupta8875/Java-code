public class Occurance2darray {
    public static int array(int n[][])
    {
        int count=0;
        for(int i=0;i<n.length; i++)
        {
            for(int j=0;j<n[0].length; j++){
                if(n[i][j]==7){
                    count++;
                }
            }
            
        }
        return count;
    }
    public static void main(String args[]){
        int n[][]={{4,7,8},{8,8,7}};
        System.out.println(array(n));



    }
    
}
