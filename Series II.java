import java.util.Scanner;
public class Series2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//6
        int a=6,b=5;
        for(int i=1;i<=n;i++)//123456
        {
            System.out.print(a +" ");//
            a=a+b;
            b=b+5;
        }
            
            
        
    }
}
