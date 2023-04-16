import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//123
       if(n==n)
        {
            System.out.println(n-n);
        }
        else
        {
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            System.out.print(n-r);
        }
        }
        
    }
}
