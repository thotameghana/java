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
        System.out.println("square root of each element");
         for(int i=0;i<n;i++)
        {
                System.out.printf("%.2f\n",Math.sqrt(a[i]));
        }
    }
}
