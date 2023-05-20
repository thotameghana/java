import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.print("-");
            } else if (Character.isLowerCase(c)) {
                System.out.print("_");
            } else {
                System.out.print("*");
            }
        }
    }
}
