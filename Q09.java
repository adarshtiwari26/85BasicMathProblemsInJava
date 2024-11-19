//Q9] WAP to check whether the given no is even or odd by reading the input from user end
import java.util.Scanner;
class Q09
{
    public static void main(String[] agrs)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        if(num%2==0)
        {
         System.out.println(num+" number is even");
        }
        else{
            System.out.println(num+" number is odd");
        }
    }
}