import java.util.*;
public class Amoeba
{
    public static void main(String[] args)
    {
        int f2=1,f1=0,m,i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Months : ");
        m = sc.nextInt();
        int n =0;
        while(i < m)
            {
                if(i<=1)
                {
                    n = i;
                }
                else
                {
                    n = f1 + f2;
                    f1 = f2;
                    f2 = n;
                }
                ++i;
            }
            
            System.out.println("The amoeba size is "+n);
    }
}
