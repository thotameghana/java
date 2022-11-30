import java.util.*;
public class Fee
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student type");
        String t=sc.next();
        switch(t){
            case "MSDS":
              System.out.println("Enter tuition fee");
              float b=sc.nextFloat();
              System.out.println("Enter bus fee");
              float c=sc.nextFloat();
               System.out.printf("The fees to be paid by the student is Rs.%.2f",b+c);
               break;
            case "MSH":
                System.out.println("Enter tuition fee");
              float d=sc.nextFloat();
              System.out.println("Enter hostel fee");
              float e=sc.nextFloat();
               System.out.printf("The fees to be paid by the student is Rs.%.2f",d+e);
               break;
            case "MGSDS":
               
               System.out.printf("Enter tuition fee");
              float f=sc.nextFloat();
              System.out.println("Enter bus fee");
              float g=sc.nextFloat();
              f=(150*f)/100;
               System.out.printf("The fees to be paid by the student is Rs.%.2f",f+g);
               break;
            case "MGSH":
                System.out.println("Enter tuition fee");
              float h=sc.nextFloat();
              System.out.println("Enter hostel fee");
              float i=sc.nextFloat();
              h=(150*h)/100;
               System.out.printf("The fees to be paid by the student is Rs.%.2f",h+i);
               break;
                
        }
    }
}
