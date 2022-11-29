import java.util.*;
public class Alice
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//23
        int c=0;
        while(a>0)
        {
            int d=a%10;//3
            c=c+d;//3
            a=a/10;//2
            
        
        }
        System.out.println(c);
    }
}
