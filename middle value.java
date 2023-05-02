import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            int middle = x;

            if ((y >= x && x >= z) || (z >= x && x >= y)) {
                middle = x;
            } else if ((x >= y && y >= z) || (z >= y && y >= x)) {
                middle = y;
            } else {
                middle = z;
            }

            System.out.println(middle);
        }
    }
}
