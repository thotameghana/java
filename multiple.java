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
        int N = in.nextInt();

        for(int i=1;i<=10;i++) {
            if(i<10) {
                System.out.print(i*N + " ");
            } else {
                System.out.println(i*N);
            }
        }

    }
}
