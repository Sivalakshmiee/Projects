import  Myownpackage.A;

import java.io.*;

import java.util.*;

class Next

{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);

int ch;

A ob=new A();

do

{

System.out.println("The Choices are"); 

System.out.println("1.Money Converter");

System.out.println("2.Distance Converter");

System.out.println("3.Time Converter");

System.out.println("Enter your choice");

ch=s.nextInt();

switch(ch)

{

case 1:

ob.MConverter();

break;



 
case 2:

ob.DConverter();

break;

case 3:

ob.TConverter();

break;

}

}while(ch<=3);

}

}
