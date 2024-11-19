import java.util.Scanner;
class Q71
{
    public static void arm(int num)
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
        if(sum==num){
            System.out.println(num);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lower range");
        int m=sc.nextInt();
        System.out.println("enter higher range");
        int n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            arm(i);
        }
    }

}