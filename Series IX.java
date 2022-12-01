import java.util.Scanner;
public class Series9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();//5
        long s=2;
        System.out.print(2 +" ");//2
        for(int i=2;i<=n;i++)//12345
        {
            s=s*s-1;//
            System.out.print(s +" ");
        }
        
    }
}
