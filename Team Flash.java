import java.util.Scanner;
public class Flash
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        float y1=sc.nextInt();
        int x2=sc.nextInt();
        float y2=sc.nextInt();
        double a=(x1+x2)/2.0;
        double b=(y1+y2)/2.0;
        System.out.printf("%.1f \n", a);
        System.out.printf("%.1f \n", b);
    }
}
