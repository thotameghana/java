import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//5
        int b=1,c=0;
        while(b<=n)//t
        {
            if((n%b)==0)//t
            c=c+1;//1
            b++;//2
        }
        if(c==2)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime");
        }
    }
}
