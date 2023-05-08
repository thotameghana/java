import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < count; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("[ ] " + numbers[i]);
            } else {
                System.out.println("[x] " + numbers[i]);
            }
        }
    }
}
