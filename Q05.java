//Q5] WAP to find the gratest among two nmbers by reading the inout from user end
import java.util.Scanner;
class Q05
{
    public static void main(String[] agrs)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of num1");
        int num1= sc.nextInt();
        System.out.println("Enter value of num2");
        int num2= sc.nextInt();
        int c= num1>num2? num1: num2;
        System.out.println("the greatest of the two num is : " + c);
    }
}