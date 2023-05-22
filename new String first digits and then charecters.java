import java.util.Scanner;

public class Delete
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String m="",l="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                m=m+c;
            }
            else
            {
                l=l+c;
            }
        }
        System.out.print(m+" ");
        System.out.println(l);
    }
}
