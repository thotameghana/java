import java.util.*;
public class Matrix
{
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix is ");
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(isPrime(a[i][j]))
                
                {
                    sum+=a[i][j];
                }
            }
        }
        
        System.out.println("the sum prime elements of matrix is "+sum);
    }
}
