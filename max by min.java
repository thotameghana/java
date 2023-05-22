import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int max=Math.max(Math.max(A,B),C);
        int min=Math.min(Math.max(A,B),C);
        if(min==0)
        {
             System.out.println(max/1);
        }
        else
        {
             System.out.println(max/min);
        }
    }
}
