import java.util.Scanner;
public class Football
{
    public static void main(String args[])
    {
         int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();//60
        b=sc.nextInt();//8
        c=a%b;//4
        d=a/b;//7
        System.out.println(d);
        System.out.println(c);
    }
}
