import java.util.*;
import java.lang.Math;
public class Pow
{
    public static void main(String args[])
    {
        int X,N;
        Scanner sc=new Scanner(System.in);
        X=sc.nextInt();
        N=sc.nextInt();
        System.out.printf("%.0f", Math.pow(X, N));
        
    }
}
