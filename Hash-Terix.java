import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int a=Character.getNumericValue(S.charAt(0));
          int b=Character.getNumericValue(S.charAt(1));
          if(a==0 && b==0)
          {
            System.out.println("Nothing Lol");
          }
          for(int i=0;i<a;i++)
          {
            System.out.print("#");
          }
           for(int i=0;i<b;i++)
          {
            System.out.print("*");
          }

    }
}
