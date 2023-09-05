package linkedlist;
public class Linkedlist {
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
        System.out.println("null");
    }
    public static void main(String args[]){
        Linkedlist l1=new Linkedlist();
        l1.print();

        l1.addfirst(1);
        l1.print();
        l1.addfirst(2);
        l1.print();
        


    }
    
}
