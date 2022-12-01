import java.util.*;
public class Lab
{
    public static void main(String args[])
    {
        int X,Y,Z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x");
        X=sc.nextInt();
         System.out.println("Enter Y");
        Y=sc.nextInt();
         System.out.println("Enter Z");
        Z=sc.nextInt();
        if(X<Y && X<Z)
        {
            System.out.println("L1 has the minimal seating capacity");
        }
        else if(Y<Z && Y<X)
        {
            System.out.println("L2 has the minimal seating capacity");
        }
        else
        {
            System.out.println("L3 has the minimal seating capacity");
        }
        
        
    }
}
