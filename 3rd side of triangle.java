import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        double x=a*a;
        double y=b*b;
        double z=x+y;
        double m=Math.sqrt(z);
        System.out.printf("%.2f",m);
    }
}
