import java.util.Scanner; 
public class Arrays { 
public static Scanner s=new Scanner(System.in);  
public static void main(String args[]) { 
System.out.println("Enter the Size of Array you want:"); 
int n=s.nextInt(); 
int[] myintegers=getintegers(n);  	 	
int[] print=printarray(myintegers); 
} 
public static int[] getintegers(int n) 
{ 
int[] array=new int[n]; 
System.out.println("Enter "+n+" values to the array:");  	 	
for(int i=0;i<array.length;i++) 
{ 
array[i]=s.nextInt(); 
} 
return array; 
} 
public static int[] printarray(int[] array) 
{ 
System.out.println("Entered Array values:");  	 	
for (int i=0;i<array.length;i++) 
{ 
System.out.println(array[i]); 
} 
return array; 
}
} 
