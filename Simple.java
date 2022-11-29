import java.util.*;
public class Simple
{
    public static void main(String args[])
    {
        int p,r;
        float t;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextFloat();
        System.out.printf("%.2f" , (p*t*r)/100);
        
    }
}
