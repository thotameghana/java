import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        int sum=0;
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        for(int i=0;i<n.length();i++)
        {
            char c=n.charAt(i);
            if(Character.isUpperCase(c))
            {
            int p=c-'A';
            sum=sum+p;
            }
        }
        System.out.println(sum);
    }
}
