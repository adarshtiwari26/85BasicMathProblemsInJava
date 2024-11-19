import java.util.Scanner;
class Q72
{
    public static boolean arm(int num)
    {
        int temp1=num;
        int temp2=num;
        int sum=0;
        int count=0;
        while(temp1>0)
        {
            count++;
            temp1/=10;
        }
        while(temp2>0)
        {
            int rem=temp2%10;
            int prod=1;
            for(int i=1;i<=count;i++)
            {
                prod=prod*rem;
            }
            sum=sum+prod;
            temp2/=10;
        }
        return sum==num;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lower range");
        int m=sc.nextInt();
        System.out.println("enter higher range");
        int n=sc.nextInt();
        int count1=0;
        for(int i=m;i<=n;i++)
        {
            if(arm(i)==true)
            {
                count1++;
            }
        }
        System.out.println(count1);
    }

}