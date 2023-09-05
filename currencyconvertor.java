import java.util.*;

import javax.print.event.PrintEvent;
public class currencyconvertor {
    public static void main(String args[]){
       HashMap<Integer,String> c= new HashMap <Integer, String>();
       c.put(1,"United States Dollar");
       c.put(2,"Nigerian Naira");
       c.put(3,"Russian Ruble");
       c.put(4,"Indian Rupee");
       c.put(5,"Philippine Peso");
       c.put(6,"Japanese Yen");
       String from, to;
       Double amount;
       Scanner sc =new Scanner(System.in);
       System.out.println("Welcome to currency convertor");
       System.out.println(("Currency converting from"));
       System.out.println("1:United States Dollar \t 2:Nigerian Naira \t 3:Russian Ruble \t 4:Indian Rupee \t 5:Philippine Peso \t 6:Japanese Yen" );
    from=c.get(sc.nextInt());
    System.out.println(("Currency converting to"));
       System.out.println("1:United States Dollar \t 2:Nigerian Naira \t 3:Russian Ruble \t 4:Indian Rupee \t 5:Philippine Peso \t 6:Japanese Yen" );
to =c.get(sc.nextInt());
System.out.println("Amount you wish to convert");
amount= sc.nextFloat();
//sendHttpGetRequest(from, to, amount);
System.out.println("Thanks you for using the currency convertor");





    }
}
