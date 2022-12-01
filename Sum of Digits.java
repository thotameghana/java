import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        while(n>0)
        {
            int c=n%10;
            a=a+c;
            n=n/10;
        }
        System.out.print(a);
    }
}
