//Q68] WAP to check whether the given number is a sunny number or not
import java.util.Scanner;
class Q68
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sunny=num+1;
        boolean b= false;
        for (int i=1; i<=sunny; i++)
        {
            if(i*i==sunny)
            {
                b=true;
                break;
            }
        }
        if(b==true)
        {
            System.out.println("Sunny number");
        }
        else{
            System.out.println("Not a Sunny number");
        }
    }
}