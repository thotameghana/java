import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int G = in.nextInt();
        int S = in.nextInt();
        int B = in.nextInt();
        S += B / 100;
        B %= 100;
        G+=S/100;
        S%=100;
        System.out.print(G+"G"+" "+S+"S"+" "+B+"B");
    }
}
