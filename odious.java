import java.util.*;
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String s = Integer.toBinaryString(x);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                count++;
            }
        }
        if (count % 2 == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
