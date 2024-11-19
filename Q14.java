//Q14]WAP to check whether the given data is a digit or not
import java.util.Scanner;
class Q14
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        if (num>-10 && num<10)
        {
            System.out.println(num+ " is a digit");
        }
        else{
            System.out.println(num+ " is not a digit");
        }

    }
}