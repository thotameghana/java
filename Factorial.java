import java.util.*;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//24
        int f=1,x=1;  
        while(f<n)
        {    
            x=x+1;
            f=f*x;
        }
        if(f==n)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
