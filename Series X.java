import java.util.*;
public class Series10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a=95.0;
        double b=20.5;
        double x;
        System.out.printf("%.1f" + " ", a);
        for(int i=1;i<=n-1;i++)
        {
            x=a+b;
            System.out.printf("%.1f" + " ", x);
            a=x;
            b=b+2;
        }
    }
}
