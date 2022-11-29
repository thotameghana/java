import java.util.*;
public class Swap
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        a=b-a;
        b=b-a;
        a=b+a;
        System.out.println(a);
        System.out.println(b);
    }
}
