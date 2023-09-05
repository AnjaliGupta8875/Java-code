public class palidrome {
    public static boolean ispalindrome(int n){
        int palindrome=n;
        int lastdigit=palindrome%10;
        int rev=0;
        while(palindrome!=0){
            rev=rev+lastdigit;
            palindrome=palindrome/10;
        }
        if (n==rev){
        return true;
        }
        
        return false;
        }
        public static void main(String args[]){
            System.out.println(ispalindrome(121));
        }
    }
    

