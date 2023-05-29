import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1,p=1;j<=i;j++,p++)
            {
                System.out.print(p+" ");
            }
            System.out.println();
        }
         for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i,p=1;j<=n;j++,p++)
            {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
