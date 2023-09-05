import java.util.ArrayList;

public class Arraylist {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
    list.add(12);
    list.add(5);
    list.add(6);//0(1)
    list.add(6,25);//o(n)
    System.out.println(list);
    // get operation
    int element= list.get(2);
    System.out.println(element);
    // delete
    list.remove(3);
    System.out.println(list);
    // set
    list.set(4,23);
    System.out.println(list);
    // contains
    System.out.println(list.contains(1));
    System.out.println(list.contains(46));
    
    
}
}