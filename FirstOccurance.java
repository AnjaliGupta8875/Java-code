public class FirstOccurance {
    public static int firstoccur(int arr[],int i,int key){
        if(i==arr.length-1){//base case
            return-1;
        }
        if(arr[i]==key){
            return i;

        }
        return firstoccur(arr, i+1,key);


    }
    public static int lastoccur(int arr[], int i, int key){
        if(i==arr.length-1){//base case
            return -1;
        }
        int isfound=lastoccur(arr, i+1, key);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.print(firstoccur(arr ,0,5));
        System.out.print(" "+lastoccur(arr ,0,5));
    }
}
