import java.io.*;

import java.util.Scanner;

class Employee
{


String Emp_name,address,Mail_id,Emp_id,Mobile_no;

Scanner get=new Scanner(System.in);

public Employee() 
{

System.out.println("Enter name of the Employee:");

Emp_name=get.nextLine();

System.out.println("Enter Mail id of the Employee:");

Mail_id=get.nextLine();

System.out.println("Enter address of the Employee:");

address=get.nextLine();

System.out.println("Enter Emp id:");

Emp_id=get.nextLine();

System.out.println("Enter Mobile No:");

Mobile_no=get.nextLine();

}

void display()

{

System.out.println("Employee id:"+Emp_id); 

System.out.println("Employee name:"+Emp_name); 

System.out.println("Employee Mobile Number"+Mobile_no);

System.out.println("Employee mail:"+Mail_id);

System.out.println("Employee address:"+address);

}

}

class Programmer extends Employee
{

float bp,salary,hra,da,swf,pf;

public Programmer() 
{

System.out.println("Enter Bas Pay:");

bp=get.nextFloat();

hra=bp*10/100;

da=bp*97/100;

pf=bp*12/100;

swf=bp*1/10000;

salary=bp+hra+da-pf-swf;




}

void display()

{

System.out.println("Programmer Details:");

super.display();

System.out.println("Basic Pay:"+bp);

System.out.println("HRA:"+hra);

System.out.println("DA:"+da);



 

System.out.println("Staff welare amount:"+swf); 

System.out.println("P F:"+pf); 

System.out.println("Salary:"+salary);

}

}

class AssistProf extends Employee

{

float bp,salary,hra,da,swf,pf;

public AssistProf()
 {

System.out.println("Enter Bas Pay:");

bp=get.nextFloat();

hra=bp*10/100;

da=bp*97/100;

pf=bp*12/100;

swf=bp *1/10000;

salary=bp+hra+da-pf-swf;

}

void display()

{

System.out.println("Assstant Profesor Details:");

super.display();

System.out.println("Basic Pay:"+bp);



 

System.out.println("HRA:"+hra); 

System.out.println("DA:"+da); 

System.out.println("Staff welare amount:"+swf); 

System.out.println("P F:"+pf); 

System.out.println("Salary:"+salary);
}

}

class AssoProf extends Employee

{

float bp,salary,hra,da,swf,pf;

public AssoProf() {

System.out.println("Enter Bas Pay:");

bp=get.nextFloat();

hra=bp*10/100;

da=bp*97/100;

pf=bp*12/100;

swf=bp *1/10000;

salary=bp+hra+da-pf-swf;

}

void display()

{

System.out.println("Associate Professor Details:");
 super.display();

System.out.println("Basic Pay:"+bp); 

System.out.println("HRA:"+hra); 

System.out.println("DA:"+da); 

System.out.println("Staff welare amount:"+swf); 

System.out.println("P F:"+pf); 

System.out.println("Salary:"+salary);
}
}

class Professor extends  Employee

{

float bp,salary,hra,da,swf,pf;

public Professor()
 {
System.out.println("Enter Bas Pay:");

bp=get.nextFloat();

hra=bp*10/100;

da=bp*97/100;

pf=bp*12/100;

swf=bp *1/10000;

salary=bp+hra+da-pf-swf;
}

void display()

{



 
System.out.println("Professor Details:");

super.display();

System.out.println("Basic Pay:"+bp);

System.out.println("HRA:"+hra);

System.out.println("DA:"+da);

System.out.println("Staff welare amount:"+swf);

System.out.println("P F:"+pf);

System.out.println("Salary:"+salary);

}
}
public class Employees 
{
public static void main(String[] args) 
{
 System.out.println("Enter Employee Details:"); 

Employee e=new Employee();

e.display();

Programmer obj1=new Programmer();

obj1.display();

AssistProf obj2=new AssistProf();

obj2.display();

AssoProf obj3=new AssoProf();

obj3.display();

Professor obj4=new Professor();

obj4.display();


}

}
