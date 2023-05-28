
import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String m = s.toUpperCase();
        int c = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        
        for (int i = 0; i < m.length(); i++) {
            char k = m.charAt(i);
            
            if (k == 'A') {
                c++;
            } else if (k == 'E') {
                c1++;
            } else if (k == 'I') {
                c2++;
            } else if (k == 'O') {
                c3++;
            } else if (k == 'U') {
                c4++;
            }
        }
        
        System.out.println(c + " " + c1 + " " + c2 + " " + c3 + " " + c4);
        
        in.close();
    }
}
