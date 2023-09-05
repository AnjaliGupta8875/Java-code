import java.util.Scanner;
public class ans1{
    public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a first number: ");
double x= sc.nextDouble();
System.out.print("Enter a second number: ");
double y= sc.nextDouble();
System.out.print("Average  of two number is: "+ average(x,y));


    }
    public static double average(double x ,double y)
    {
        return (x+y)/2;
    }
}