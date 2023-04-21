import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String byteStr = sc.nextLine();
        int count = 0;
        for (int i = 0; i < byteStr.length(); i++) {
            if (byteStr.charAt(i) == '1') {
                count++;
            }
        }
        int result = count * 2;
        System.out.println(result);
    }
}
