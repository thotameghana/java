import java.util.Scanner;
class GrandParent
{
void grandparent()
{
System.out.println("grand parent name.");
}
}
class Father extends GrandParent
{
void fathername()
{
System.out.println("Father name.");
}
}
class Son extends Father
{
void sonname()
{
System.out.println("Son name.");
}
}
public class Main
{
public static void main(String args[])
{
Son s=new Son();
s.sonname();
s.fathername();
s.grandparent();
}
}

