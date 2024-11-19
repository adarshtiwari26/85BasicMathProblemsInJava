//Q61] WAP to count the perfect number between the range m & n
import java.util.Scanner;
class Q61
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter lower range number");
        int m=sc.nextInt();
        System.out.println("Enter highe range number");
        int n=sc.nextInt();
        int count=0;
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
                count++;
            }
        }
        System.out.println(count);
    }
}