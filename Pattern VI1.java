import java.util.Scanner;
public class Pattern6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         for (int i = n; i > 0; i--)
         {
            for (int j = n; j > i; j--) 
            {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
