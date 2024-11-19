//Q15]WAP to check whether the given character is an alphabet or digit or a special symbol
import java.util.Scanner;
class Q15
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter character");
        char ch=sc.next().charAt(0);
        if ((ch>'A' && ch<'Z')|| (ch>'a' && ch<'z'))
        {
            System.out.println(ch+ "It is an alphabet");
        }
        else if (ch>'0' && ch<'9')
        {
            System.out.println(ch+ " is digit");
        }
        else{
            System.out.println(ch+ "is a special symbol");
        }

    }
}