import java.util.LinkedList;
public class mergesortLL {
    public Node mergesort(Node head){
if(head==null && head.next!=null)
    //find mid 
    Node mid = getMid( Node head);
    Node slow= head;
    Node
    //left & right mergesort
    Node rightHead=mid.next;
    mid.next=null;
    Node newleft = mergesort(head);
    NOde newright =mergesort(righthead);
//merge
return merge(newLeft, newRight);
        } 
           public static void main(String args[]){

    }
}
