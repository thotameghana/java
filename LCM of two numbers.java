import java.util.Scanner;
public class Lcm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//5
        int b=sc.nextInt();//30
        int max=1,x,Lcm=0;
        if(a>b)//skip
        {
            max=x=a;//5
        }
        else
        {
            max=x=b;//30
        }
        while(a!=0)//5!=0
        {
            if(max % a==0 && max % b==0)//
            {
                Lcm=max;
                break;
            }
            max +=x;
        }
        System.out.print("LCM of " + a + " and " + b + " is " + Lcm);
    }
}
