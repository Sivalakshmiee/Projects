import java.io.*;

public class FileExample

{

public static void main(String args[]) throws IOException {

BufferedReader br = new BufferedReader(new

InputStreamReader(System.in));

System.out.println("\nEnter a file name:"); String fName=br.readLine(); File f =new File(fName);

String result = f.exists()?"Exists": "does not exist.";

System.out.println("\nThe given file "+result);

if(f.exists())

{

System.out.println("The file length is "+f.length()+"in bytes"); if(fName.endsWith(".jpg")||fName.endsWith(".gif")||fName

.endsWith(".png"))

{

System.out.println("The given file is an Image file");

}

else if(fName.endsWith(".exe")){

System.out.println("The given file is an executable file");

}

else if(fName.endsWith(".txt"))

{

System.out.println("The given file is a text file");

}



 
else if(fName.endsWith(".java"))

{

System.out.println("The given file is a java file");

}

else

{

System.out.println("The file type is unknown");

}

}

}

}

