import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int smallestOdd = Integer.MAX_VALUE;
        for (String number : numbers) {
            int n = Integer.parseInt(number);
            if (n % 2 != 0 && n < smallestOdd) {
                smallestOdd = n;
            }
        }
        System.out.println(smallestOdd);
    }
}
