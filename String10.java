import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        String line = in.nextLine();
        for(int i=0;i<line.length();i++)
        {
            char c=line.charAt(i);
            sum=sum+(int)c;
        }
        System.out.println((int)Math.sqrt(sum));
    }
}
