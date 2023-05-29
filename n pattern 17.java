import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1,p=i;j<=i;j++,p+=5)
            {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
