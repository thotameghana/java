import java.util.*;
public class Strong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i=0,f=1,s=0,a1=0,r=0;;
        a1=a;
        while(a>0)
        {
            r =a%10;
            for(i=1;i<=r;i++)
            {
                f=f*i;
            }
            a=a/10;
            s=s+f;
            f=1;
            
        }
        if(s==a1)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }
    }
}
