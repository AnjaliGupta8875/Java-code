public class stringPalindrome {
    public stringPalindrome() {
    }
 
    public static boolean ispalindrome(String var0) {
       for(int var1 = 0; var1 < var0.length() / 2; ++var1) {
          int var2 = var0.length();
          if (var0.charAt(var1) != var0.charAt(var2 - var1 - 1)) {
             return false;
          }
       }
 
       return true;
    }
 
    public static void main(String[] var0) {
       String var1 = "A man, a plan, a canal: Panama";
       System.out.println(ispalindrome(var1));
    }
 }
 
    
