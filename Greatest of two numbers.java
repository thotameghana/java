import java.util.*;
public class Compare
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==b)
        {
            System.out.printf("%d is equal to %d",a,b);
        }
        else if(a>b)
        {
            System.out.printf("%d is greater than %d",a,b);
        }
        else if(b>a)
        {
            System.out.printf("%d is less than %d",a,b);
        }
        
    }
}
