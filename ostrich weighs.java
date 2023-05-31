import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String G = in.next();
        int W = in.nextInt();
        if(G.equals("F"))
        {
           double m=W*1.2;
           System.out.println((int)m);
        }
        else if(G.equals("M"))
        {
            double m=W/1.2;
            System.out.println((int)m);
        }
        else
        {
            System.out.println("UNKNOWN");
        }
        
    }
}
