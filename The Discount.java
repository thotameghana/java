import java.util.Scanner;
public class Discount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();//20.50
        float b=sc.nextFloat();//45.40
        float c=sc.nextFloat();//10
        double d=a+b;
        System.out.printf("%.2f\n",d);//65.90
        double e=(d*c)/100;//6.59
        System.out.printf("%.2f\n",d-e);
        System.out.printf("%.2f\n",e);
        
    }
}
