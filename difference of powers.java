
import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        long m=X*X;
        long k=(X+1)*(X+1);

        System.out.println(k-m);
    }
}
