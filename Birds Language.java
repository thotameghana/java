import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        for(int i=0;i<string.length();i++)
        {
            char c=string.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                 System.out.print(c+"p"+c);
            }
            else
            {
                System.out.print(c);
            }
        }
       // System.out.println("answer");
    }
}
