import java.util.Scanner;
public class Series5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pre=11;
        System.out.printf(pre*pre +" ");
        for(int i=1;i<n;i++)
        {
            pre=pre+4;
            System.out.printf(pre*pre +" ");
        }
    }
}
