import java.util.Scanner;
class Q78
{
    public static boolean tech(int num)
    {
        int temp=num;
        int count=0;
        int sq=0;
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
            sq=sum*sum;
        }
        return sq==num;
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
            if(tech(i)==true)
            {
                count1++;
            }
        }
        System.out.println(count1);
    }

}