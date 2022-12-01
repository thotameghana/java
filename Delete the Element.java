import java.util.Scanner;
public class Delete
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
        int b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==b)
            {
                c=c+1;
            }
        }
        if(c==0)
        {
            System.out.println("Invalid input");
        }
        else
        {
        for(int i=0;i<n;i++)
        {
            if(a[i]==b)
            {
                
            }
            else
            {
                System.out.println(a[i]);
            }
        }
        }
    }
}
