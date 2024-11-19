//Q1] WAP to swap two numbers using a temporary variable while taking input from user
import java.util.Scanner;
class Q01
{
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of num1");
    int num1=sc.nextInt();
    System.out.println("Enter the value of num2");
    int num2=sc.nextInt();
    System.out.println("Before Swaping");
    System.out.println("num1 : " + num1);
    System.out.println("num2 : " + num2);
    int temp=num2;
    num2=num1;
    num1=temp;
    System.out.println("After Swaping");
    System.out.println("num1 : " + num1);
    System.out.println("num2 : " + num2);

    sc.close();
    }
    
}