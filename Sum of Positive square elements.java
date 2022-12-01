import java.util.Scanner;
public class Pos
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();//246
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]*a[i]==a[i])
            {
                System.out.println(a[i]);
            }
        }
        
    }
}
