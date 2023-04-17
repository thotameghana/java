import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int minDigit = 9; // initialize to largest possible digit
        int maxDigit = 0; // initialize to smallest possible digit
        while (n > 0) {
            int digit = n % 10;
            minDigit = Math.min(minDigit, digit);
            maxDigit = Math.max(maxDigit, digit);
            n /= 10;
        }
        System.out.println(minDigit);
        System.out.println(maxDigit);
    }
}
