public class static_Key {
    public static void main(String agrs[]){
student s1=new student();
s1.schoolName ="jmv";
student s2= new student();
System.out.println(s2.schoolName);
    }
}
class student{
    String name;
    int roll;
    static String schoolName;
    void setname(String name){
        this.name=name;
        
    }
     String getname(){
         return this.name;

    }
}
