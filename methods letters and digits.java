import java.util.*;
public class letters
{
    public static void string(String m)
    {
        int count=0;
           int c1=0;
       for(int i=0;i<m.length();i++)
       {
           String k=m.toLowerCase();
           char c=k.charAt(i);
           if(Character.isLowerCase(c))
           {
               count++;
           }
           else if(Character.isDigit(c))
           {
               c1++;
           }
       }
       System.out.println("LETTERS "+count);
       System.out.println("DIGITS "+c1);
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        string(s);
    }
}
