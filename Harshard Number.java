import java.util.*;
public class Harshard
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//234
        int m=0,a1=0;
        a1=n;
        while(n>0)
        {
            int d=n%10;//4
            m=m+d;//4
            n=n/10;//23
        }
        if(a1%m==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }
        
    }
}
