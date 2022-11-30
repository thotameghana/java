import java.util.*;
public class Profit
{
    public static void main(String args[])
    {
        float x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of a dozen mangoes");
        x=sc.nextFloat();
        System.out.println("Enter the price at which 1 mango is being sold");
        y=sc.nextFloat();
        float r=x/12;
        float s=y*12;
         if(s>x)
        {
            System.out.printf("Profit : Rs.%.2f",(s-x));
        }
        else if(s<x)
        {
            System.out.printf("loss : Rs.%.2f",(x-s));
        }
         else
        {
            System.out.printf("No profit nor loss");
        }
    }
}
