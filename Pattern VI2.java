import java.util.Scanner;
public class Pattern4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//5
        for(int i=1;i<=n;i++)//12345
        {
            for(int j=n;j>=i;j--)
            {
            System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
