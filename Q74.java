import java.util.Scanner;
class Q74
{
    public static void auto(int num)
    {
        int temp=num;
        int sq=num*num;
        int count=0;
        while(temp>0)
        {
            count++;
            temp/=10;
        }
        int d=1;
        for(int i=1;i<=count;i++)
        {
            d=d*10;
        }
            int rem=sq%d;
            if (rem==num)
            {
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
            auto(i);
        }
    }

}