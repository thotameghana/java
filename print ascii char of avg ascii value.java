import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lenS = in.nextInt();
        int sum = 0;
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sum += (int) c;
        }
        int k = sum / lenS;
        System.out.println((char) k);
    }
}
