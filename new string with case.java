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
                m=m+c;
            }
        }
        System.out.println("New string with upeer case"+m);
    }
}
