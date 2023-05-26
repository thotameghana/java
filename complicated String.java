import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c) || Character.isUpperCase(c) || Character.isWhitespace(c)) {
                System.out.print(c);
            }
        }
    }
}
