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
        int sum=0;
        int N = in.nextInt();
        for(int i=2;i<=N;i+=2)
        {
            sum=i+sum;
        }
        System.out.println(sum);

    }
}
