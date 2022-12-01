import java.util.Scanner;
public class Series4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        float pre=0.5f;
        for(int i=1;i<=n;i++)//12345
        {
            System.out.print(pre+ " ");
            pre=pre*3;
        }
    }
}
