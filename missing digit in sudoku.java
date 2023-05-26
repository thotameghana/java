import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        
        for (char digit = '1'; digit <= '9'; digit++) {
            if (line.indexOf(digit) == -1) {
                System.out.println(digit);
                break;
            }
        }
    }
}
