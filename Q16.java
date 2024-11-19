//Q16]WAP to check whether the given alphabet is an uppercase or lowercase 
import java.util.Scanner;
class Q16
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter character");
        char ch=sc.next().charAt(0);
        if (ch>'A' && ch<'Z')
        {
            System.out.println("The character is an uppercase alphabet");
        }
        else if (ch>'a' && ch<'z')
        {
            System.out.println("The character is an lowercase alphabet");
        }
        else{
            System.out.println("The character is not an alphabet");
        }
    }
}
