import java.util.Scanner;
public class Pattern10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) 
        { 
            for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
        }	
       
       for(int i=n-1;i>=1;i--)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2)-1;k++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
