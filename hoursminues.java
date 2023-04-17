import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String duration = in.next();
        String[] p=duration.split(":");
        int h=Integer.parseInt(p[0]);
        int m=Integer.parseInt(p[1]);
        int i=h*60+m;
        System.out.println(i);
    }
}
