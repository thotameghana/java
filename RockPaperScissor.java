import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String call1 = in.next();
        String call2 = in.next();
        if(call1.equals("ROCK")&&call2.equals("ROCK")||call1.equals("SCISSORS")&&call2.equals("SCISSORS")||call1.equals("PAPER")&&call2.equals("PAPER"))
        {
            System.out.println("DRAW");
        }
        else if(call1.equals("PAPER")&&call2.equals("SCISSORS"))
        {
            System.out.println("PLAYER2");
        }
        else if(call1.equals("SCISSORS")&&call2.equals("PAPER"))
        {
            System.out.println("PLAYER1");
        }
         else if(call1.equals("ROCK")&&call2.equals("SCISSORS"))
        {
            System.out.println("PLAYER1");
        }
        else if(call1.equals("SCISSORS")&&call2.equals("ROCK"))
        {
            System.out.println("PLAYER2");
        }
         else if(call1.equals("ROCK")&&call2.equals("PAPER"))
        {
            System.out.println("PLAYER2");
        }
        else if(call1.equals("PAPER")&&call2.equals("ROCK"))
        {
            System.out.println("PLAYER1");
        }
    }
}
