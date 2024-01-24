import java.io.*;
import java.util.*;
class Shape
{
int x,y;
Scanner s=new Scanner(System.in);

}
class Rectangle extends Shape
{
public void print_area()
{
int area;
System.out.println("Enter the length:");
x=s.nextInt();
System.out.println("Enter the Breadth:");
y=s.nextInt();
area=x*y;
System.out.println("The Area of the Rectangle is"+area);
}
}
class Triangle extends Shape
{
public void print_area()
{
double area;
System.out.println("Enter the length:");
x=s.nextInt();
System.out.println("Enter the Breadth:");
y=s.nextInt();
area=(double)((x*y)/2);
System.out.println("The Area of Triangle is"+area);
}
}
class Circle extends Shape
{
public void print_area()
{
double area;
System.out.println("Enter the Radius:");
x=s.nextInt();
area=3.14*x*x;
System.out.println("The area of the circle is"+area);
}
}
class Color
{
public static void main(String args[])
{
int choice;
public void print_area();
Rectangle r=new Rectangle();
Triangle t=new Triangle();
Circle c=new Circle();
do
{
System.out.println("Press 1 for Rectangle");
System.out.println("Press 2 for Triangle");
System.out.println("Press 3 for Circle");
Scanner s=new Scanner(System.in);
choice=s.nextInt();
switch(choice)
{
case 1:
{
r.print_area();
break;
}
case 2:
{
t.print_area();
break;
}
case 3:
{
c.print_area();
break;
}

}
}
while(choice<4);
}
}
