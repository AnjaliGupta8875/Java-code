
    //import java.io.*;
import java.util.*;

public class string_palindrome_m_2 {

   
        
        public static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        // While there are characters to compare
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
         
        if (isPalindrome(str))
 
            // It is a palindrome
            System.out.print("Yes");
        else
 
            // Not a palindrome
            System.out.print("No");
    }
}


