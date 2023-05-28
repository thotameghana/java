import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n1 = in.next();
        String n2 = in.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n1.length(); i++) {
            char c = n1.charAt(i);
            char c1 = n2.charAt(i);

            if (c == '0' && c1 == '0') {
                result.append("0");
            } else {
                result.append("1");
            }
        }

        System.out.println(result.toString());
    }
}
