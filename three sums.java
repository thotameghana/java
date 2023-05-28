import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long s=0,s1=0,s2=0;
        long n = in.nextLong();
        for(int i=1;i<=n;i++)
        {
            s=s+i;
            s1=s1+i*i;
            s2=s2+i*i*i;
        }
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

    }
}
