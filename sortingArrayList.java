import java.util.ArrayList;
import java.util.Collections;
public class sortingArrayList {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(12);    
        list.add(5);
        list.add(9);
        list.add(3);
       list.add(1);
       Collections.sort(list);//ascending
       System.out.println(list);
       //descending
       Collections.sort(list, Collections.reverseOrder());
       // comparator -function logic or ye ek aisa function hai jo sorting ka logic deifned karta hai
       System.out.println(list);


       
}}
