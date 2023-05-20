import java.util.Scanner;
public class Digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The two digit numbers are:");
         for(int i=0;i<n;i++)
        {
            if(a[i]>9 && a[i]<100)
            {
                System.out.println(a[i]);
            }
        }
    }
}
