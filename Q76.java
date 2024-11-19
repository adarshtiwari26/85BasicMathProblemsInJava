import java.util.Scanner;
class Q76
{
    public static void tech(int num)
    {
        int temp=num;
        int count=0;
        while(temp>0)
        {
            count++;
            temp/=10;
        }
        if(count%2==0)
        {
            int d=1;
            for(int i=1;i<=count/2;i++)
            {
                d=d*10;
            }
            int first=num/d;
            int sec=num%d;
            int sum=first+sec;
            int sq=sum*sum;
            if(sq==num)
            {
                System.out.println("Tech number");
            }
            else{
                System.out.println("Not a Tech number");
            }
        }
        else{
            System.out.println("Not a Tech number");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        tech(num);
    }

}