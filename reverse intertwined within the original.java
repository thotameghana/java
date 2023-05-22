import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char m=sb.charAt(i);
            System.out.print(c);
            System.out.print(m);

        }   
    }
}
