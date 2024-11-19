//Q53] WAP to print strong number between range m and n
import java.util.Scanner;
class Q53
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter lower range number");
        int m=sc.nextInt();
        System.out.println("Enter highe range number");
        int n=sc.nextInt();
        for(int i=m; i<=n;i++)
        {
        int temp=i;
        int num=i;
        int sum=0;
        while(temp>0)
        {
            int rem=temp%10;
            int fact=1;
            for(int j=rem;j>0;j--)
            {
                fact=fact*j;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println(num);
        }
        }
    }
}