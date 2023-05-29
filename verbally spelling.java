import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine().toLowerCase();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == 'a') {
                output.append("Alpha ");
            } else if (c == 'b') {
                output.append("Bravo ");
            } else if (c == 'c') {
                output.append("Charlie ");
            } else if (c == 'd') {
                output.append("Delta ");
            } else if (c == 'e') {
                output.append("Echo ");
            } else if (c == 'f') {
                output.append("Foxtrot ");
            } else if (c == 'g') {
                output.append("Golf ");
            } else if (c == 'h') {
                output.append("Hotel ");
            } else if (c == 'i') {
                output.append("India ");
            } else if (c == 'j') {
                output.append("Juliett ");
            } else if (c == 'k') {
                output.append("Kilo ");
            } else if (c == 'l') {
                output.append("Lima ");
            } else if (c == 'm') {
                output.append("Mike ");
            } else if (c == 'n') {
                output.append("November ");
            } else if (c == 'o') {
                output.append("Oscar ");
            } else if (c == 'p') {
                output.append("Papa ");
            } else if (c == 'q') {
                output.append("Quebec ");
            } else if (c == 'r') {
                output.append("Romeo ");
            } else if (c == 's') {
                output.append("Sierra ");
            } else if (c == 't') {
                output.append("Tango ");
            } else if (c == 'u') {
                output.append("Uniform ");
            } else if (c == 'v') {
                output.append("Victor ");
            } else if (c == 'w') {
                output.append("Whiskey ");
            } else if (c == 'x') {
                output.append("X-ray ");
            } else if (c == 'y') {
                output.append("Yankee ");
            } else if (c == 'z') {
                output.append("Zulu ");
            }
        }

        if (output.length() > 0) {
            output.deleteCharAt(output.length() - 1); // Remove the last space
        }

        System.out.println(output.toString());
    }
}
