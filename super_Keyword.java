public class super_Keyword {
    public static void main(String agrs[]){
horse h= new horse();
System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}
class horse extends Animal{
    horse(){
        super.color="brown";
        //super();
        System.out.println("horse construction is created");
    }
}
