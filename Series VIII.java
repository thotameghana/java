import java.util.Scanner;
public class Series8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(4 +" ");
        int s=4;
        for(int i=1;i<n;i++)
        {
            s=s+i*i;//
            System.out.print(s +" ");
        }
    }
}
