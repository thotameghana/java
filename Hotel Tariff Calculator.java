import java.util.*;
public class Hotel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//3
        float b=sc.nextFloat();//1500
        int c=sc.nextInt();//2
        if(a==4||a==5||a==6||a==11||a==12)
        {
            float d=(20*b)/100;
            System.out.printf("Hotel Tariff: Rs.%.2f ", + (b+d)*2);
        }
        else if(a>12)
        {
            System.out.printf("Invalid Input");
        }
        else
        {
         System.out.printf("Hotel Tariff: Rs.%.2f ", + (b*c));
        }
        
    }
}
