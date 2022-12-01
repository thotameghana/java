import java.util.*;
public class Pattern8
{
    public static void main(String[] args)
    {
        //Write your code
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
    }
}
