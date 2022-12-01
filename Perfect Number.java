import java.util.Scanner;
public class Perfect
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//6
        int c=0;
        for(int i=1;i<=a;i++)//123456
        {
            if(a%i==0)//00
            {
                c=c+i;//0
            }
            
        }
        if(c==0)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
    }
}
