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
        int n = in.nextInt();
        int sum=0;
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            int m=v;
            sum=sum+m;
            }
        System.out.println(sum*sum);
    }
}
