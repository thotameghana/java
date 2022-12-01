import java.util.*;
public class Budget
{
    public static void main(String args[])
    {
        int A,B,C,D,E;
        Double f,g,h,i,j,k;
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt(); B=sc.nextInt(); C=sc.nextInt(); D=sc.nextInt(); E=sc.nextInt();
        f=A*350.34;
        g=B*230.90;
        h=C*190.55;
        i=D*125.30;
        j=E*180.90;
        k=f+g+h+i+j;
        if(k<15000)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
