//package linkedlist;
public class LinkedListmiddle {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static node head;
    public static node tail;

public void addlast(int data){
    node newnode=new node(data);
    //tail.next=newnode;
    if(head==null){
        System.out.println("linked list is empty");
        head=tail=newnode;
        return;
    }
    tail.next=newnode;
    tail=newnode;

}
public void addfirst(int data){
    //step1=create new node
    node newnode =new node(data);
    if(head==null){
head=tail=newnode;
return;
    }
    
    //step2 - newnode next=head
    newnode.next=head;//link
    //step 3 head=newnode
    head=newnode;


}
public void print(){
    node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;

    }
    System.out.println("null");}
    public void add(int index, int data){
        if(index==0){
            addfirst(data);
            return;
        }
        node newnode= new node(data);
        node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;

        }
        newnode.next=temp.next;
        temp.next=newnode;

    }

public static void main(String args[]){
    LinkedListmiddle  ll =new   LinkedListmiddle ();
//ll.print();
ll.addlast(3);
//ll.print();
ll.addlast(4);
ll.addfirst(5);
ll.add(0,9);
//ll.print();

ll.print();
}

}
