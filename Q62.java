//Q62] WAP to check whether the given number is perfect square or not
import java.util.Scanner;
class Q62
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        boolean b= false;
        for(int i=1;i<=num;i++)
        {
            if(i*i==num)
            {
                b=true;
                break;
            }
        }
        if(b==true)
        {
            System.out.println(num + " is a perfect square");
        }
        else{
            System.out.println(num + " is not a perfect square");
        }
    }
}