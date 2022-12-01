import java.util.Scanner;
public class Sumarray
{
    public static void main(String[] args)
    {
        int c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=c+a[i];
        }
        System.out.println(c);
    }
}
