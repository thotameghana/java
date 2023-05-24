import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if(Character.isUpperCase(c))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
