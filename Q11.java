//Q11] WAP to check whether the person is eligible to write upsc exam or not
import java.util.Scanner;
class Q11
{
    public static void main(String[] agrs)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
        int age= sc.nextInt();
        if(age>=18 && age<=32)
        {
         System.out.println("Eligible to write upsc exam ");  
        }
        else{
            System.out.println("Not eligible for writing upsc exam");
        }
    }
}