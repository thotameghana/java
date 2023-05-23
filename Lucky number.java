import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String m = in.nextLine();
        if(m.contains("6")||m.contains("8"))
        {
            System.out.print("Lucky");
        }
        else
        {
            System.out.print("Not Lucky");
        }
    }
}
