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
       int max=a[0][0];
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               if(max<a[i][j])
               {
                   max=a[i][j];
               }
           }
       }
       System.out.println("the maximum element is "+max);
    }
}
