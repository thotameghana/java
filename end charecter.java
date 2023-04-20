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
       String s = Integer.toString(N);
       for(int i=1;i<=s.length();i++)
       {
        System.out.print(s.charAt(s.length()-1));
        break;
       }
        }
    }
