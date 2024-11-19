//Q49] WAP to check whether the given number is spy number or not
import java.util.Scanner;
class Q49
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int mul=1;
        while(num>0)
        {
            int rem=num%10;
            sum=sum+rem;
            mul=mul*rem;
            num=num/10;
        }
        if(sum==mul)
        {
            System.out.println("SPY number");
        }
        else{
            System.out.println("not a SPY number");
        }
    }
}