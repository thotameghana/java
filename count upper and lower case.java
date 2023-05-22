import java.util.Scanner;

public class Delete
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int cu=0,cl=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
            {
                cu++;
            }
            else if(Character.isLowerCase(c))
            {
                cl++;
            }
        }
        System.out.println("upper case letters are:"+cu);
        System.out.println("lower case letters are"+cl);
    }
}
