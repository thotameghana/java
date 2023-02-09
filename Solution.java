import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        if(s.equals("Scissors"))
        {
            System.out.println("Stone");
        }
        else if(s.equals("Stone"))
        {
            System.out.println("Hand");
        }
        else if(s.equals("Hand"))
        {
            System.out.println("Scissors");
        }
        else
        {
            System.out.println("Error");
        
        }
    }
}
