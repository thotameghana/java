import java.util.Scanner;
public class hello
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a=="rock"&&b=="rock"||a=="sissor"&&b=="sissor"||a=="paper"&&b=="paper")
        {
            System.out.println("tie");
        }
        if(a=="rock"&&b=="sissor")
        {
            System.out.println("Anjali wins");
        }
        else if(a=="paper"&&b=="sissor")
        {
            System.out.println("Abinav wins");
        }
        else if(a=="paper"&&b=="rock")
        {
            System.out.println("Anjali wins");
        }
        else if(a=="rock"&&b=="sissor")
        {
            System.out.println("Anjali wins");
        }
        else if(a=="rock"&&b=="sissor")
        {
            System.out.println("Abinav wins");
        }
        else if(a=="sissor"&&b=="paper")
        {
            System.out.println("Anjali wins");
        }
        
    }
}
