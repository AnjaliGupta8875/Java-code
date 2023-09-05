import java.util.LinkedList;
public  class javacollectionframework{
    public static void main(String args[]){
        //create
        LinkedList<Integer> ll=new LinkedList<>();
        //add
        ll.addLast(5);
        ll.addLast(4);
        ll.addFirst(7);
        // 7->5->4
        System.out.println(ll);
//remove
ll.removeLast();
ll.removeFirst();
System.out.println(ll);
    }
}