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
            int min=a[i][0];
            for(int j=0;j<3;j++)
            {
                if(min>a[i][j])
                {
                    min=a[i][j];
                }
            }
             System.out.println("the minimum element in"+(i+1)+" is "+min);
        }
    }
}
