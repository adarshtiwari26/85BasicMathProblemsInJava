//Q13]WAP to check whether the given value is a positive or negative or zero
import java.util.Scanner;
class Q13
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter integer value");
        int num=sc.nextInt();
        if (num>0)
        {
            System.out.println("Number is positive");
        }
        else if (num<0)
        {
            System.out.println("Number is negavtive");
        }
        else{
            System.out.println("zero");
        }
    }
}