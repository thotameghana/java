import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n1 = in.nextLine();
        String n2 = in.nextLine();
        for(int i=0;i<n1.length();i++)
        {
            char c=n1.charAt(i);
            char d=n2.charAt(i);
            if(c=='1'&&d=='1')
            {
                System.out.print("1");
            }
            else
            {
                    System.out.print("0");
            }
        }
    }
}
