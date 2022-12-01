import java.util.*;
public class Lights
{
    public static void main(String args[])
    {
        float s,d,t;
        Scanner sc=new Scanner(System.in);
        s=sc.nextFloat();
        d=sc.nextFloat();
        t=sc.nextFloat();
        if(s/d<t)
        {
            System.out.println("no");
        }
        if(s/d>t)
        {
            System.out.println("yes");
        }
        
    }
}
