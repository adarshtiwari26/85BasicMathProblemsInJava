//Q79] WAP to check whether the given number is prime number or not
import java.util.Scanner;
class Q79
{
    public static void prime(int num)
    {
        int count=0;
        for(int j=1;j<=num;j++)
        {
            if(num%j==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        prime(num);
    }
}