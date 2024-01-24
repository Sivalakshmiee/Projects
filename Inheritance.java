class A
{
public void dispA()
{
System.out.println("disp() method of ClassA");
}
}
class B extends A
{
public void dispB()
{
System.out.println("disp() method of ClassB");
}
}
class C extends A
{
public void dispC()
{
System.out.println("disp() method of ClassC");
}
}
public class Inheritance
{
public static void main(String args[])
{
B b=new B();
b.dispB();
b.dispA();
C c=new C();
c.dispC();
c.dispA();
}
}

