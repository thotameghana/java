import java.util.*;
public class Matrix
{
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
               if(a[i][j]%2==0)
               {
                   sum=sum+a[i][j];
               }
            }
        }
        System.out.println("the sum even elements of matrix is "+sum);
    }
}
