//Q85] WAP to print the sum of first 20 numbers in fibonacci series
class Q85
{
    public static void main(String[] args)
    {
        int num1=0;
        int num2=1;
        int sum=num1+num2;
        int count=2;
        while(count<20)
        {
            int num3=num1+num2;
            sum=sum+num3;
            num1=num2;
            num2=num3;
            count++;
        }
        System.out.println(sum);
    }
}