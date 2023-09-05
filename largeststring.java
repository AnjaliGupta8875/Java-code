public class largeststring {
    public static void main(String args[]){
        String fruit[]={"apple","mango", "banana"};
        String largest=fruit[0];
        for(int i=1; i<fruit.length;i++){
            if(largest.compareTo(fruit[i]) <0){
                largest=fruit[i];
            }
        }// lexicographic m is greater than a and b.
        // so m has largest string.
        System.out.println(largest);
    }
}
