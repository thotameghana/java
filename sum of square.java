import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum*sum);
    }
}
