//Q55] WAP to find out factors for the given number
import java.util.Scanner;
class Q55
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        for(int i=num;i>0;i--)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }
    }
}