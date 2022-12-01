import java.util.Scanner;
public class Series6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//5
        int a=0;
        for(int i=1;i<=n;i++)//012345
        {
            if(i%2==0)
            {
                a=(i*i)-2;
                System.out.print(a +" ");
            }
             else
        {
        System.out.print(((i*i)-1) +" ");//
        }
        }
        
    }
}
