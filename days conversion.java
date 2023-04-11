import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n/365;
        System.out.print(a+" years ");
        int b=a%4;
        System.out.print(b+" Weeks ");
        int c=b%7;
        System.out.print(c+" days ");
    }
}
