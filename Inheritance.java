import java.util.Scanner;
class Animal
{
    void dog()
    {
        System.out.println("Eating");
    }
    void cat()
    {
        System.out.println("Meov");
    }
    void lion()
    {
        System.out.println("killing");
    }
}
class Birds extends Animal
{
    void parrot()
    {
        System.out.println("Singing");
    }
    void bird()
    {
        System.out.println("flying");
    }
}
public class Inherit
{
    public static void main(String args[])
    {
        Birds bd=new Birds();
        bd.parrot();
        bd.bird();
        bd.lion();
        bd.cat();
        bd.dog();
    }
}
