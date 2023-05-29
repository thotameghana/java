import java.math.BigDecimal;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        BigDecimal pi = new BigDecimal(Math.PI);
        String piString = pi.toString().replace(".", "");
        
        System.out.println(piString.substring(0, n));
    }
}
