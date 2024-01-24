import java.io.*; 
import java.util.*; 
class Eb 
{ 
Scanner s=new Scanner(System.in); 
public void cust() 
{ 
double monthread; 
System.out.println("Enter the customer number:");  
String customernumber=s.nextLine();  
System.out.println("Enter the customer name:");  
String customername=s.nextLine();  
System.out.println("Enter the previous month  reading");  
double prevmonthreading=s.nextDouble();  
System.out.println("Enter the current month reading");  
double curmonthreading=s.nextDouble();  
monthread=curmonthreading-prevmonthreading; 
System.out.println("Enter the type of EB connection(1 for domestic and 2 for commercial)"); 
int choice=s.nextInt(); 
switch(choice) 
{ 
case 1:

{ 
if(monthread<=100) 
{ 
System.out.println("Rs.1 per unit"); 
System.out.println("The Amount to be paid is: " + (1*monthread)); 
} 
else if(monthread>=101 && monthread<=200) 
{ 
System.out.println("Rs. 2.5 per unit"); 
System.out.println("The Amount to be paid is:" + (2.50*monthread)); 
} 
else if(monthread>=201 && monthread<=500) 
{ 
System.out.println("Rs. 4 per unit"); 
System.out.println("The Amount to be paid is: " + (4*monthread)); 
} 
else if(monthread>=501) 
{ 
System.out.println("Rs. 6 per unit"); 
System.out.println("The Amount to be paid is:" + (6*monthread)); 
}

else 
{ 
System.out.println("No more conditions"); 
} 
break; 
} 
case 2: 
{ 
if(monthread<=100) 
{ 
System.out.println("Rs. 2 per unit"); 
System.out.println("The Amount to be paid is: "+ (2*monthread)); 
} 
else if(monthread>=101 && monthread<=200) 
{ 
System.out.println("Rs. 4.50 per unit"); 
System.out.println("The Amount to be paid is:" + (4.50*monthread)); 
} 
else if(monthread>=201 && monthread<=500) 
{ 
System.out.println("Rs. 6 per unit"); 
System.out.println("The Amount to be paid is:" + (6*monthread)); 
}


else if(monthread>=501) 
{ 
System.out.println("Rs. 7 per unit"); 
System.out.println("The Amount to be paid is: " +(7*monthread)); 
} 
else 
{ 
System.out.println("No more conditions"); 
} 
break; 
} 
} 
} 
public static void main(String args[]) 
{ 
Eb E=new Eb(); 
E.cust(); 
} 
} 
