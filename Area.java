import java.util.*;
public class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("a side of a square ");//2
        int a=sc.nextInt();
        System.out.println("length of a rectangle");//4
        int b=sc.nextInt();
         System.out.println("breadth of a rectangle");//5
        int c=sc.nextInt();
        System.out.println("radius of a circle");//2
        float d=sc.nextFloat();
        System.out.println(a*a);//4
        System.out.println(b*c);//20
        System.out.printf("%.2f",3.14*d*d);//12.56
    }
}
