//Q8]WAP to find greatest among 5 numbers using conditional operator , without using logical op
import java.util.Scanner;
class Q08
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
        System.out.println("Enter value of num5");
        int e= sc.nextInt();
        int res= a>b?(a>c?(a>d?(a>e?a:e):(d>e?d:e)):(c>d?(c>e?c:e):(d>e?d:e))):(b>c?(b>d?(b>e?b:e):(d>e?d:e)):(c>d?(c>e?c:e):(d>e?d:e)));
        System.out.println("the greatest of the five num is : " + res);
    }
}