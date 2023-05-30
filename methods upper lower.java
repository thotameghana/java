import java.util.*;
public class upper
{
    public static void string(String s)
    {
        int cu=0;
        int cl=0;
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
        System.out.println("UPPER CASE "+cu);
         System.out.println("LOWER CASE "+cl);
    }
    
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    string(s);
}
}
