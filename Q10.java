//Q10] WAP to check whether the person is eligible to apply for shaddi.com
import java.util.Scanner;
class Q010
{
    public static void main(String[] agrs)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
        int age= sc.nextInt();
        if(age>=21)
        {
         System.out.println("Eligible for applying on shaddi.com");  
        }
        else{
            System.out.println("Not eligible");
        }
    }
}