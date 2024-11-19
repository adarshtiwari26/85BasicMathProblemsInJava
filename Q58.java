//Q58] WAP to count factors of all the numbers between m and n
import java.util.Scanner;
class Q58
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
            int count=0;
            for(int i=j;i>0;i--)
        {
            if(j%i==0)
            {
                count++;
            }
        }
        System.out.println("the count of factor for "+ j + " is : " + count);
        }
        
    }
}