//Q50] WAP to print palindrome number between m and n
import java.util.Scanner;
class Q50
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter lower range number");
        int m=sc.nextInt();
        System.out.println("Enter highe range number");
        int n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            int temp=i;
        int rev=0;
        while(temp>0)
        {
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(i==rev)
        {
            System.out.println(rev);
        }
        }
    }
}