//Q60] WAP to print perfect number between range m and n
import java.util.Scanner;
class Q60
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter lower range number");
        int m=sc.nextInt();
        System.out.println("Enter higher range number");
        int n=sc.nextInt();
        for (int j=m;j<=n;j++)
        {
            int sum=0;
        for(int i=j-1;i>0;i--)
        {
            if(j%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==j)
        {
            System.out.println(j);
        }
        }
    }
}