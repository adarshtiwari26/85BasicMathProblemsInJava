//Q80] WAP to print ptime numbers between the rsnge m &n
import java.util.Scanner;
class Q80
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
            System.out.println(num);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter lower range");
        int m= sc.nextInt();
        System.out.println("Enter higher range");
        int n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            prime(i);
        }
    }
}