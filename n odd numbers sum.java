
import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        int sum=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n*2;i++)
        {
         if(i%2==1)
            {
                 int m=i*i;
                 sum=sum+m;
            }
        }
        System.out.println(sum);
    }
}
