import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toLowerCase();
        int count=0,count1=0,c1=0;
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if(Character.isDigit(c))
            {
                count++;
            }
            else if(Character.isWhitespace(c))
            {
                c1++;
            }
            else //if(Character.isLowerCase(c))
            {
                count1++;
            }

        }
        System.out.println(Math.round(count1/count));
    }
}
