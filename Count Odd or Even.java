import java.util.Scanner;
public class Count
{
    public static void main(String args[])
    {
        int c=0,c1=0;
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
            if((a[i] % 2)==0)
            {
                c=c+1;
            }
            else
            {
                c1=c1+1;
            }
            }
            System.out.println("Odd:" +c1);
            System.out.println("even:" +c);
    }
}
