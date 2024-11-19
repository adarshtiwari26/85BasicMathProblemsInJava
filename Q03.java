//Q3]WAP to Swap two numbers without using temporary variable and without using arithmethic op
import java.util.Scanner;
class Q03
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
    num1=num1^num2;
    num2=num1^num2;
    num1=num1^num2;
    System.out.println("After Swaping");
    System.out.println("num1 : " + num1);
    System.out.println("num2 : " + num2);
    sc.close();
    }
}