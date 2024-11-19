//Q59] WAP to check whether the given number is a perfect number or not
import java.util.Scanner;
class Q59
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int sum=0;
        for(int i=num-1;i>0;i--)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==num)
        {
            System.out.println(num + " is a perfect number");
        }
        else{
            System.out.println(num + " is not a perfect number");
        }
    }
}