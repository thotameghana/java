import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[]=new int[N];
        int temp;
        for(int i=0;i<N;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
                for(int i=0;i<N;i++)
        {
        System.out.print(a[i]);
        if (i != N - 1) {
                System.out.print(" ");
            }
            
        }
    }
}
