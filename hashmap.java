
import java.util.HashMap;

public class hashmap {
    public static void main(String args[]){
    // to create hashmap
    HashMap<String, Integer> hm =new HashMap<>();
// to insert 
hm.put("India",100);
hm.put("china", 150);
hm.put("Us", 50);
System.out.println(hm);
// get operations
int p=hm.get("India");
System.out.println(p);
// containskey-o(1)
System.out.println(hm.containsKey("India"));
System.out.println(hm.containsKey("Indonasia"));
 //remove
 System.out.println(hm.remove("china"));
 System.out.println(hm);
 // to know the size of hashmap
 System.out.println(hm.size());
 //is Empty
 System.out.println(hm.isEmpty());
 //to clear all hashmap
 hm.clear();
 System.out.println(hm.isEmpty());




}}
