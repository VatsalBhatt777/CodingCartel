import java.util.*;
import java.io.*;



public class Survey {

	public static void main(String[] args) throws IOException{
		
Scanner scanny = new Scanner(System.in);	

System.out.println("Please enter your name: ");

String name = scanny.nextLine();

WriteOutput(name);
//ReadFile(name);

	}

	public static void WriteOutput(String FileName) throws IOException{
		
		File file = new File("C:\\Users\\bhavat\\Desktop\\Feedback.csv");

		//creates file
		file.createNewFile();

		//creates fileWriter Obj
		FileWriter writer = new FileWriter(file, true); 

		//Writes the content to the file
		writer.write("This is an example\n"); 
		writer.flush();
		writer.close();

		
	}
	
	public static void ReadFile(String FileName) throws IOException{
		// Creates a FileReader Object
	      FileReader fr = new FileReader(FileName); 
	      char [] a = new char[50];
	      fr.read(a);   // reads the content to the array
	      
	      for(char c : a)
	         System.out.print(c);   // prints the characters one by one
	      fr.close();

	}
	}
	

