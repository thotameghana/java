import java.util.Scanner;
public class Same
{
    public static void main(String[] args)
    {
        int c=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x[]=new int[a];
        for(int i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        int y[]=new int[b];
        for(int i=0;i<b;i++)
        {
            y[i]=sc.nextInt();
        }
        if(a==b)
        {
            for(int i=0;i<b;i++)
            {
                if(x[i]==y[i])
                {
                    c=c+1;
                }
                
            }
        }
        if(c==b)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not Same");
        }
    }
}
