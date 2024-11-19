//Q57] WAP to print factors of all the numbers between m and n
import java.util.Scanner;
class Q57
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter lower range number");
        int m=sc.nextInt();
        System.out.println("Enter higher range number");
        int n=sc.nextInt();
        System.out.println();
        for (int j=m;j<=n;j++)
        {
            for(int i=j;i>0;i--)
        {
            if(j%i==0)
            {
                System.out.println(i);
            }
        }
        System.out.println();
        }
        
    }
}