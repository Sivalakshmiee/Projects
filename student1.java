import java.io.*; 
import java.util.*; 
class student1 
{ 
Scanner s=new Scanner(System.in); 
public void stud() 
{ 
int rno,m1,m2,m3,total; 
String name; 
float per; 
System.out.println("Enter the student roll number,name:"); 
rno=s.nextInt(); 
name=s.nextLine(); 
System.out.println("Enter the 3subjects marks"); 
m1=s.nextInt(); 
m2=s.nextInt(); 
m3=s.nextInt(); 
total=m1+m2+m3; 
System.out.println("Roll No.:"+rno); 
System.out.println("Name:"+name); 
System.out.println("Marks:"+m1+"\t"+m2+"\t"+m3); 
System.out.println("Total ="+total); 
per=total/3; 
if(per>=75) 
{
System.out.println("Class: Distinction"); 
} 
else if(per>=60 && per<=74) 
{ 
System.out.println("Class:First Class"); } 
else if(per<60) 
{ 
System.out.println("Class:Second Class"); 
} 
else 
{ 
System.out.println(); 
} 
} 
public static void main(String args[]) { 
student1 s=new student1(); 
s.stud(); 
} 
} 
