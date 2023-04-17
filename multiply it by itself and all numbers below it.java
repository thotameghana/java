import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++)
        {
            int m=N*i;
            sum=sum+m;
        }
        System.out.println(sum);
    }
}
