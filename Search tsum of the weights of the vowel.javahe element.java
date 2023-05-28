import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        String s = in.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = (s.charAt(i));
            int weight = 0;

            if (c == 'a') {
                weight = 1;
            } else if (c == 'e') {
                weight = 2;
            } else if (c == 'i') {
                weight = 3;
            } else if (c == 'o') {
                weight = 4;
            } else if (c == 'u') {
                weight = 5;
            }
             else if (c == 'A') {
                weight = 2;
            }
             else if (c == 'E') {
                weight = 4;
            }
             else if (c == 'I') {
                weight = 6;
            }
             else if (c == 'O') {
                weight =8;
            }
             else if (c == 'U') {
                weight = 10;
            }


            sum += weight;
        }

        System.out.println(sum);
    }
}
