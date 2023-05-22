import java.util.Scanner;

public class hello {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String even="",odd="";
        String s[] = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            String m = s[i];
            for (int j = 0; j < m.length(); j++) {
                char c = m.charAt(j);
                if (j % 2 == 0) {
                    even=even+c;
                } else {
                   odd=odd+c;
                }
            }
        }
        System.out.println("even number characters are:"+even);
        System.out.println("odd number characters are:"odd);
    }
}
