public class substring_recursive {
    public static void substring(String str,int i){
       int n=str.length();
        if(i==str.length()){
        return ;
        }

        if(str.charAt(i)==str.charAt(n-i-1)){
            System.out.print(i+" ");
        }
        substring(str,i+1);
    }


    
    public static void main(String args[]){
String str="abcab";

  substring(str,0);

    }
}

    

