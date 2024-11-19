//Q65] WAP to check whether the given number is neon number or not
import java.util.Scanner;
class Q65
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
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
            System.out.println("It is a neon number");
        }
        else{
            System.out.println("It is not a neon number");
        }
    }

}