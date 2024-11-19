//Q46] WAP to check whether the given number is a palindrome number or not
import java.util.Scanner;
class Q46
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(temp>0)
        {
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(num==rev)
        {
            System.out.println(num + " is a palindrome number");
        }
        else{
            System.out.println(num + " is not a palindrome number");
        }
    }
}