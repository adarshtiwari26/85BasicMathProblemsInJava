//Q47] WAP to print factorial of a given number
import java.util.Scanner;
class Q47
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int f=1;
        while(num>0)
        {
            f=f*num;
            num=num-1;
        }
        System.out.println(f);
    }
}