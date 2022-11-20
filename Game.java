import java.util.Scanner;
public class Game
{
    public static void main(String args[])
    {
        int a,b,c,d,e,f;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();//l and b of wall
        b=sc.nextInt(); 
        c=sc.nextInt();//l and b of 1 st paint
        d=sc.nextInt();
        e=sc.nextInt();//l and b of 2 paint
        f=sc.nextInt();
        int g=d+f;//10
        if(g==b&&c==e)
        {
            System.out.println("karthi can fix both painting");
        }
        else
        {
            System.out.println("karthi cannot fix both painting");
        }
        
    }
}
