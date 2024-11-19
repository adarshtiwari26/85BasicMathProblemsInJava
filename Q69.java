//Q69] WAP to check whether the given number is a duck number or not
import java.util.Scanner;
class Q69
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        boolean b=false;
        while (num>0)
        {
            int rem= num%10;
            if(rem==0)
            {
                b=true;
                break;
            }
            num=num/10;
        }
        if(b==true)
        {
            System.out.println("Duck number");
        }
        else{
            System.out.println("Not a Duck number");
        }
    }

}
