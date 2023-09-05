public class prime {
    public static boolean isprime(int n){
        boolean isprime =true;
        for(int i=2; i<=n-1; i++)
        {
            if(n%i==0){
                isprime=false;

                

            }
        }
        //return isprime;
        return isprime;
    }
    public static void primeInRange(int n){
        for(int i=2; i<=n; i++)
        {
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

        public static void main(String args[]){
            System.out.println(isprime(100));
            primeInRange(100);
        }
    }
    

