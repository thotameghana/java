import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String krap = scanner.nextLine();
        String result = s.replaceAll(krap, "");
        System.out.println(result);
    }
}
