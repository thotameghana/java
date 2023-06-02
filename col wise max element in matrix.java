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
        System.out.println("the matrix is:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            int max=a[i][i];
            for(int j=0;j<3;j++)
            {
                if(max<a[j][i])
                {
                    max=a[j][i];
                }
            }
            System.out.println("the colum wise maximum element in"+(i+1)+" col is "+max);
        }
    }
}
