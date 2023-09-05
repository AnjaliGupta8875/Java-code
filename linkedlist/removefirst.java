package linkedlist;
public class removefirst {
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
    public int remove(){
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
        System.out.println("null");
    }
    public static void main(String args[]){
removefirst ll =new   removefirst();
ll.print();
ll.addlast(3);
ll.print();
ll.remove();
ll.addlast(4);
ll.print();
    }

}

    
   
    
