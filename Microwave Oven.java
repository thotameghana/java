import java.util.Scanner;
public class Microwave
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items");
        int n =sc.nextInt();
        System.out.println("Enter the single item heating time");
        float h = sc.nextFloat();
        
        float rht = (h/2)+h;
        
        if(n <= 2)
        {
            System.out.printf("The recommended heating time is %.2f",rht);
        }
        else if(n > 2)
        {
            System.out.println("Number of items is more");
        }

    }
}
