import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String wishlist = in.nextLine(); // The list containing the items to search for.
        int N = in.nextInt(); // The amount of items you will dig through.
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String item = in.nextLine();
              if(wishlist.contains(item))
              {
                System.out.println("YOINK");
              }
              else
              {
                System.out.println("YEET");
              }
    }
    }
}
