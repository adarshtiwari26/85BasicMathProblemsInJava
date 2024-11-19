//Q4]WAP to Swap three numbers using temporary variable
import java.util.Scanner;
class Q04
{
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of num1");
    int num1=sc.nextInt();
    System.out.println("Enter the value of num2");
    int num2=sc.nextInt();
    System.out.println("Enter the value of num3");
    int num3=sc.nextInt();
    System.out.println("Before Swaping");
    System.out.println("num1 : " + num1);
    System.out.println("num2 : " + num2);
    System.out.println("num3 : " + num3);
    int temp=num3;
    num3=num2;
    num2=num1;
    num1=temp;
    System.out.println("After Swaping");
    System.out.println("num1 : " + num1);
    System.out.println("num2 : " + num2);
    System.out.println("num3 : " + num3);
    sc.close();
    }
}