import java.util.Scanner;
public class Arithmetic
{
public static void main(String args[])
{
Arithmetic a=new Arithmetic();
a.ar();
}
Scanner s= new Scanner(System.in);
public void ar()
{
double num1, num2;
System.out.println("Enter a First Number:");
num1=s.nextDouble();
System.out.println("Enter a second Number:");
num2=s.nextDouble();
System.out.println("Enter an Operator:");
char operator=s.next().charAt(0);
s.close();
double output;
switch(operator)
{
case '+':
output=num1 + num2;
break;
case '-':
output=num1 - num2;
break;
case '*':
output=num1 * num2;
break;
case '/':
output=num1 / num2;
break;
default:
System.out.println("You have entered wrong operator");
return;
}
System.out.println(num1+""+operator+""+num2+":"+output);
}
}