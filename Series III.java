import java.util.Scanner;
public class Series3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//5
        int pre=3;
        for(int i=1;i<=n;i++)//12345
        {
            System.out.printf(pre +" ");
            pre=pre*3;
        }
    }
}
