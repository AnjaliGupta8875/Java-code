//package linkedlist;

public class CycleLinkedList {
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
    public int removefirst(){
        int val=head.data;
        head=head.next;
        return val;
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
public static boolean iscycle(){
    node slow=head;
    node fast= head;
    while(fast!=null && fast.next !=null){
        slow=slow.next;// +1 vali move
        fast=fast.next.next; // +2 vali move
       if(slow==fast){
        return true; // cycle exists

       } 

    }
    return false;//cycle doesn't exist
    }
 
    public static void main(String args[]){
    CycleLinkedList l1=new CycleLinkedList();
        //l1.print();

       // l1.addfirst(1);
       // l1.print();
       // l1.addfirst(2);
       // l1.print();
       // l1.addlast(34);
       // l1.print();
       // l1.add(0,1);
        //l1.print();
        head=new node(1);
        head.next=new node(2);
        head.next.next=new node(3);
        head.next.next.next=head;
        System.out.println(iscycle());
        //l1.removefirst();
        //l1.print();
        //l1.removelast();
       // l1.print();
        
    
    
}}


