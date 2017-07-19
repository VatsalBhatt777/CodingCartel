import java.util.*;
import java.io.*;



public class Survey {

	public static void main(String[] args) throws IOException{
		
Scanner scanny = new Scanner(System.in);	

ShortQuestions("What is one thing you would like to see change, if any ");
ShortQuestions("What is it that helps you to be productive and provide quality service? ");


	}

	public static void WriteOutput(String WriteThis) throws IOException{
		
		File file = new File("C:\\Users\\bhavat\\Desktop\\Feedback.csv");

		//creates file
		file.createNewFile();

		//creates fileWriter Obj
		FileWriter writer = new FileWriter(file, true); 

		//Writes the content to the file
		writer.write(WriteThis); 
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
	public static void ShortQuestions(String Question) throws IOException{
		System.out.println("Please answer following");
		System.out.println(Question);
		Scanner userAnswer = new Scanner(System.in);
		String answer= userAnswer.nextLine();
		WriteOutput(Question);
		WriteOutput("/n");
		WriteOutput(answer);
		
		
		
	}
public static void multipleChoice (String question, String[] responses) {
		
		System.out.println(question);
		Scanner userInput= new Scanner(System.in);
		String answerOutput = "Possible answer choices are as follows \n";
		
		//string together possible answers for later printing
		for(int i = 0; i<= responses.length; i++ )
			answerOutput += i + ": " + responses[i] + ", ";
			
		System.out.println(answerOutput);
		int userInt = userInput.nextInt();
		
	} 
	}
	
	

