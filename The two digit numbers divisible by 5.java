import java.util.Scanner;
public class Delete
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
        System.out.println("The two digit numbers divisible by 5 are:");
         for(int i=0;i<n;i++)
        {
            if(a[i]>9 && a[i]<100 && a[i]%5==0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
