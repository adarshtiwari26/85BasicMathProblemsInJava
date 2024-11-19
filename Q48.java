//Q48] WAP to print factorial of all number between range m and n
import java.util.Scanner;
class Q48
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter lower range number");
        int m=sc.nextInt();
        System.out.println("Enter higher range number");
        int n=sc.nextInt();
        
        for(int i=m;i<=n;i++)
        {
            int f=1;
            int j=i;
            while(j>0)
        {
            f=f*j;
            j=j-1;
        }
        System.out.println("Factorial of " +i+ " is : " +f);
        }
    }
}