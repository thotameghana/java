import java.util.Scanner;
public class Sumofnum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//1
        int m=sc.nextInt();//10
        int sum=0,i;
       for(i=n;i<=m;i++)
       sum=sum+i;
       System.out.println(sum);
    }
}
