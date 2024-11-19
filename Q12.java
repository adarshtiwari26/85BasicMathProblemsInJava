//Q12] WAP to check whether the person is eligible for army
import java.util.Scanner;
class Q12
{
    public static void main(String[] agrs)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
        int age= sc.nextInt();
        System.out.println("Enter height in cm");
        double h= sc.nextDouble();
        System.out.println("Enter weight in kg");
        int w= sc.nextInt();
        if(age>=18 && h>=170 && w<80)
        {
         System.out.println("Eligible for Army ");  
        }
        else{
            System.out.println("Not eligible for Army");
        }
    }
}