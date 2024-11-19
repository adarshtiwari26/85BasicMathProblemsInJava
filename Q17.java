//Q17] WAp to print result of the student by reading the student marks
import java.util.Scanner;
class Q17
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks");
        int mark=sc.nextInt();
        if(mark>91 && mark<=100)
        {
            System.out.println("Outstanding");
        }
        else if(mark>81 && mark<=90)
        {
            System.out.println("Excellent");
        }
        else if(mark>71 && mark<=80)
        {
            System.out.println("Very Good");
        }
        else if(mark>61 && mark<=70)
        {
            System.out.println("Good");
        }
        else if(mark>51 && mark<=60)
        {
            System.out.println("Average");
        }
        else if(mark>41 && mark<=50)
        {
            System.out.println("Just pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}