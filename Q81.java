//Q81] WAP to print first 10 prime number
class Q81
{
    public static void main(String[] args)
    {
        int num=1;
        int count=0;
        while(count<10)
        {
            int c=0;
            for (int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                   c++;
                }
            }
            if(c==2)
            {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}