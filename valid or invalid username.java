import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String u = in.nextLine();
        int count=0;
        for(int i=0;i<u.length();i++)
        {
            char c=u.charAt(i);
            if(Character.isDigit(c))
            {
                count++;
            }

        }
        if(count==3 && u.length()<=20)
        {
             System.out.println("VALID");
        }
        else
        {
            System.out.println("INVALID");
        }
       
    }
}

