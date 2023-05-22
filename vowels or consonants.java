import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int count=0,count1=0;
        for(int i=1;i<string.length();i++)
        {
            char c=string.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                count++;
            }
            else
            {
                count1++;
            }
        }
        if(count>=count1)
        {
            System.out.println("vowels");
        }
        else
        {
            System.out.println("consonants");
        }
    }
}
