//Q6] WAP to find greatest among 3 numbers using conditional operator, without using logical op
import java.util.Scanner;
class Q06
{
    public static void main(String[] agrs)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of num1");
        int num1= sc.nextInt();
        System.out.println("Enter value of num2");
        int num2= sc.nextInt();
        System.out.println("Enter value of num3");
        int num3= sc.nextInt();
        int res= num1>num2?(num1>num3?num1:num3):num2>num3?num2:num3;
        System.out.println("the greatest of the three num is : " + res);
    }
}