//Q7] WAP to find greatest among 4 numbers using conditional operator , without using logical op
import java.util.Scanner;
class Q07
{
    public static void main(String[] agrs)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of num1");
        int a= sc.nextInt();
        System.out.println("Enter value of num2");
        int b= sc.nextInt();
        System.out.println("Enter value of num3");
        int c= sc.nextInt();
        System.out.println("Enter value of num4");
        int d= sc.nextInt();
        int res= a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d));
        System.out.println("the greatest of the four num is : " + res);
    }
}