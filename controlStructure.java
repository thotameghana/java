import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double sum=0;
        for(int i=1;i<=N;i++)
        {
            double m=Math.pow(i,2);
            double k=Math.pow(i,3);
            sum=sum+m+k+i;
        }
        System.out.println((int)sum);
   }}
