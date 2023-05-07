import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int maxAscii = 0;

        for (int i = 0; i < word.length(); i++) {
            int ascii = (int)word.charAt(i);
            if (ascii > maxAscii) {
                maxAscii = ascii;
            }
        }

        System.out.println(maxAscii);
    }
}
