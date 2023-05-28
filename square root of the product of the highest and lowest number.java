import java.util.Scanner;

public class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];
        
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        
        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible value
        int min = Integer.MAX_VALUE; // Initialize min with the largest possible value
        
        for (int i = 0; i < N; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            
            if (a[i] < min) {
                min = a[i];
            }
        }
        int m=max*min;
        System.out.println((int)Math.sqrt(m));
    }
}
