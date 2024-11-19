//Q67] WAP to count neon number between range m & n
import java.util.Scanner;
class Q67
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower range");
        int m=sc.nextInt();
        System.out.println("Enter highe range");
        int n=sc.nextInt();
        int count=0;
        for(int i=m;i<=n;i++)
        {
            int num=i;
            int sq=num*num;
            int sum=0;
            while(sq>0)
            {
                int rem=sq%10;
                sum=sum+rem;
                sq=sq/10;
            }
            if(sum==num)
            {
                count++;
            }
        }
        System.out.println(count);
    }

} 