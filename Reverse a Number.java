import java.util.*;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem,res=0;
        while(n>0)
          {
            rem = n%10;
            n = n/10;
            res = (res*10)+rem;
        }
        System.out.println(res);
    }
}
