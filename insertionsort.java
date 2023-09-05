public class insertionsort {
   public static void insertion_sort(int arr[]){
for(int i=0; i<arr.length-1; i++){
int curr=i;
int prev=i-1;
//finding out correct position insert
while(prev>=0 &&arr[prev]>arr[curr]){
    arr[prev +1]=arr[prev];
    prev--;

}
arr[prev+1]=arr[curr];
}
   } 
   public static void main (String args[]){
    int arr[]={5,4,1,3,2};
    System.out.println(insertion_sort(arr));
   }
}
