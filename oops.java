public class oops {
    public static void main(String args[]){
Pen p1 =new Pen ();//created a pen object called p1
p1.setcolor("blue");
System.out.println(p1.color);
p1.settip(5);
System.out.println(p1.tip);
    
BankAccount myacc=new BankAccount();
myacc.username="anjali";
myacc.setpassword("abcde");
    
    
}}
class BankAccount{
    public String username;
    private String password;
public void setpassword(String pwd){
    password= pwd;
}

}

class Pen{
    //properties +functions
    String color;
    int  tip;
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
} 
class Student{
    String name;
    int age;
    float percentage;
    void calcpercentage(int phy, int chem, int math){
percentage=(phy+chem+math)/3;
    }
}