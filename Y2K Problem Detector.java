import java.util.*;
public class Agedetect
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year of Birth");//27
        a=sc.nextInt();
        System.out.println("Enter current year");//07
        b=sc.nextInt(); 
        if(b<a)
        {
        System.out.printf("Your age is %d",(100-a)+b);
        }
        else
        {
          System.out.printf("Your age is %d" ,(b-a)); 
        }

    }
}
