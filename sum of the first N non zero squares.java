import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        double sum=0;
        for(int i=1;i<=N;i++)
        {
            sum=sum+i*i;
        }
        System.out.println((long)sum);
    }
}

