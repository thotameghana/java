/*
Print the sum of digits of a decimal number converted to binary.
Example: 15 in decimal => 1111 in binary, output will be 4.
Input
Input < 999999
Output
Output < 21
Example
Input
15
Output
4

*/
import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        String m=Integer.toBinaryString(X);
        int k=Integer.parseInt(m);
        int sum=0,r=0;
        while(k>0)
        {
            r=k%10;
            sum=sum+r;
            k=k/10;
        }
        System.out.println(sum);
    }
}
