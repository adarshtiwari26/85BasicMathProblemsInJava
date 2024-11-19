//Q56] WAP to print the count of factors for the given number
import java.util.Scanner;
class Q56
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        int count=0;
        for(int i=num;i>0;i--)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}