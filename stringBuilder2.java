public class stringBuilder2 {

   
    public static void main (String args[]){
//we know in java string is immutable so by the use of string builder class we can make our string mutable.
        StringBuilder sb =new StringBuilder("I Like programming");
        // append method is used to append string at the last 
System.out.println(sb);
sb.append(" and coffee");
System.out.println(sb);
// to insert string at the middle
sb.insert(18,", gaming");
System.out.println(sb);
// replace method is used to replace string from given index
sb.replace(2,6,"love");
System.out.println(sb);
sb.delete(7,19);
System.out.println(sb);
//convert string builder to a string by using toString function
String str =sb.toString();
System.out.println(str);


    }
}
