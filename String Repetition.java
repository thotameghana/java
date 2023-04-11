import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(str+" ");
        }
    }
}
