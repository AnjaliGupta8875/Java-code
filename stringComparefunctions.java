public class stringComparefunctions {
    
    public static void main(String args[]){
String s1="anjali";
String s2="anjali";
String s3=new String("anjali");
if(s1==s2){
    System.out.println("strings are equal");
 } else{
        System.out.println("string are not equal");

    }
    if(s1==s3){
    System.out.println("strings are equal");
 } else{
        System.out.println("string are not equal");

    }
    //method 2 using compare functions
    if(s1.equals(s3)){
        System.out.println("strings are equal");
} else{
       System.out.println("string are not equal");

   }
}
    }

