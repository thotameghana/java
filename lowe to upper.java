import java.util.Scanner;

public class Delete
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String m="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
            {
                m+=Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c))
            {
                m+=Character.toUpperCase(c);
            }
            else
            {
                m+=" ";
            }
        }
        System.out.print(m);
    }
}
