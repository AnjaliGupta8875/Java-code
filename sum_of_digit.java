public class sum_of_digit {
        public static int sumOfDigits(int n){
            int sum=0;
            while(n>0){
            int last_digit=n%10;
            sum=sum+last_digit;
    n=n/10;
        }
        return sum;
    }
        public static void main(String args[]){
System.out.println(sumOfDigits(967));
    }
}
