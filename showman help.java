import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>=0 && n<=12)
        {
            System.out.println("0");
        }
        else if(n>=13 && n<=14)
        {
            System.out.println("1");
        }
        else if(n>=15 && n<=16)
        {
            System.out.println("2");
        }
        else if(n>=17 && n<=18)
        {
            System.out.println("3");
        }
    }
}
