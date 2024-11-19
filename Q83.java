//Q83] WAP to print last 10 3digit prime number
class Q83
{
    public static void main(String[] args)
    {
        int num=999;
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
            num--;
        }
    }
}