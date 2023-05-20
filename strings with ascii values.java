import java.util.Scanner;

public class Delete {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s[] = new String[n];
        
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }
        
        for (int i = 0; i < s.length; i++) {
            String currentString = s[i];
            for (int j = 0; j < currentString.length(); j++) {
                char c = currentString.charAt(j);
                System.out.println(c+ " " + (int) c);
            }
        }
    }
}
