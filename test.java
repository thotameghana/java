import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int n = in.nextInt();
            if(n%2==0)
            {
                System.out.println(n*2);
            }
            else
            {
                System.out.println(n*3);
            }
        }
    }
}
