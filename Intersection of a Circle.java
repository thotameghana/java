import java.util.*;
public class Circle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        
        double c = Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
        if(c == r1+r2)
        {
            System.out.println("The circles are tangential");
        }
        else if(c<=r1+r2)
        {
            System.out.println("The circles overlap");
        }
        else
        {
            System.out.println("The circles do not overlap");
        }
    }
}
