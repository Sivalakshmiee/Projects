import java.io.*;
import java.util.*;
class Logic
{
public static void main(String args[])
{
Logic l=new Logic();
l.logic();
}
Scanner s=new Scanner(System.in);
public void logic()
{
int a;
System.out.println("Enter a number:");
a=s.nextInt();
System.out.println("A= "+a);
if(a>=75)
{
System.out.println("Greater");
}
else if(a>=60 && a<=74)
{
System.out.println("Mid range");
}
else if(a<60)
{
System.out.println("Less than");
}
else
{
System.out.println();
}
}
}
