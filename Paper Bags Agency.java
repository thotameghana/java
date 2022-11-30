import java.util.Scanner;
public class Paper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();//1000
        int x=sc.nextInt();//2
        int y=sc.nextInt();//1
        int a=(w*x)-(w*y)-100;
        System.out.println(a);
    }
}
