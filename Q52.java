//Q52] WAP to check whether the given number is a strong number or not
import java.util.Scanner;
class Q52
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp>0)
        {
            int rem=temp%10;
            int fact=1;
            for(int i=rem;i>0;i--)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a Strong number");
        }
    }
}