import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                if (Character.isAlphabetic(c)) {
                    if (j % 2 == 0) {
                        sb.append(Character.toUpperCase(c));
                    } else {
                        sb.append(Character.toLowerCase(c));
                    }
                } else {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
