//Q84] WAP to print first 10 fibonacci series numbers
class Q84
{
    public static void main(String[] args)
    {
        int num1=0;
        int num2=1;
        System.out.println(num1);
        System.out.println(num2);
        int count=0;
        while(count<8)
        {
            int num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
            count++;
        }
    }
}