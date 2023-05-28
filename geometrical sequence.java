
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int R = scanner.nextInt();

        printGeometricSequence(N, R);
    }

    private static void printGeometricSequence(int N, int R) {
        long currentTerm = 1;

        for (int i = 0; i < N; i++) {
            System.out.print(currentTerm);

            if (i != N - 1) {
                System.out.print(" ");
            }

            currentTerm *= R;
        }

        System.out.println();
    }
}
