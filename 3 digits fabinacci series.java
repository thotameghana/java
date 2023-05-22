import java.util.Scanner;
public class hello
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=0,c=1,d;
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c+" ");
        for(int i=3;i<n;i++)
        {
            d=a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
        }
    }
}
