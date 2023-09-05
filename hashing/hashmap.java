import java.util.*;
public class hashmap {
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("us", 50);
        hm.put("Brazil", 10);
        System.out.println(hm);
        // hashmap is unordered map
        //get -o(1)
       
        int population= hm.get("India");
        System.out.println(population);
        //containskey 
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonsia"));
        //remove
        System.out.println(hm.remove("china"));
        System.out.println(hm.remove("chin"));
        System.out.println(hm);
        //size
        System.out.println(hm.size());
        //isempty
        System.out.println(hm.isEmpty());
        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
        




}
    
}
