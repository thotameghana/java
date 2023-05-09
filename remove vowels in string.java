

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String output = input.replaceAll("[aeiouAEIOU]", "");
    System.out.println(output);
  }
}
