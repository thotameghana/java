import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int asciiValue = (int) str.charAt(i);
            sum += asciiValue;
            if (asciiValue % 2 == 0) {
                sum += asciiValue;
            }
        }
        System.out.println(sum);
    }
}
