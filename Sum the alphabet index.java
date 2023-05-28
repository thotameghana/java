import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int alphabetIndex = (int) Character.toLowerCase(c) - 96;
            sum += alphabetIndex;
        }
        System.out.println(sum);
    }
}

