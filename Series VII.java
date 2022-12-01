
import java.util.Scanner;
public class Series7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//5
        float a=1;
        float b=2;
        System.out.printf("%.0f", a ," ");
        System.out.printf(" %.1f",b);
            for(int i=1;i<n-1;i++)//12345
            {
            if(i%2==1)
            {
                a=a*3;
                System.out.printf(" %.1f"+ " ",a);
            }
            else
            {
            b=b*3;
            System.out.printf(" %.1f"+ " ",b);
            }
            }
        }
}
