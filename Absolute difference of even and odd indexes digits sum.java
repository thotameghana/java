import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                if (num % 2 == 0) {
                    sum += num;
                } else {
                    sum2 += num;
                }
            }
        }
        System.out.println(Math.abs(sum2 - sum));
    }
}
