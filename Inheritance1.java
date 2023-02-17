import java.util.Scanner;
class Parent
{
    int a=10;
    void display()
    {
        System.out.println("Parent");
    }
}
class Child extends Parent
{
    int b=20;
    void show()
    {
        System.out.println("Child");
    }
}
class main{
public static void main (String[] args) {
    Child c=new Child();
    c.show();
    c.display();
}
}

    
