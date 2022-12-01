import java.util.Scanner;
public class Dine
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        if(n==2 && str.equals("front"))
        {
            System.out.println("Right Handed");
        }
        else if(n==1 && str.equals("front"))
        {
            System.out.println("Left Handed");
        }
        else if(n==2 && str.equals("rear"))
        {
            System.out.println("Left Handed");
        }
        else if(n==1 && str.equals("rear"))
        {
            System.out.println("Right Handed");
        }
    }
}
