import java.util.*;
public class Garden
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();//4
        b=sc.nextInt();//6
        c=sc.nextInt();//2
        if((c>=1 && c<=a)||(c%5==0 )&&(c%2==0)||(c%5==1))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}
