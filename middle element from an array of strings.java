import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String[] arr = input.split(" ");

        int length = arr.length;
        int midIndex = length / 2;

        if (length % 2 == 0) {
            String middleElements = arr[midIndex - 1] + arr[midIndex];
            System.out.println(middleElements);
        } else {
            System.out.println(arr[midIndex]);
        }
    }
}
