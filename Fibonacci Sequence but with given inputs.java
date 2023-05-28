import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        long a= in.nextInt();
        long b = in.nextInt();
        long c;
        for(int i=1;i<=t;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
