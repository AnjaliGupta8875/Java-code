public class reverseArray {
    public static void reverse(int n[]){
int first=0;
int last=n.length-1;
while(first<last){
    //swap
    int temp=n[first];
    n[first]=n[last];
    n[last]=temp;
    first++;
    last --;
}
    }
    public static void main(String args[]){
        int n[]={ 2,4,6,8,10};
        reverse(n);
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
}

