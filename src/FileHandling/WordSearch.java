package FileHandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordSearch 
{
   public static void main(String[] args) throws IOException 
   {
   
	   String input="Estuate Software Company private Limited"; 
	   File myDirectory=new File("C:\\New folder\\Folder1\\SubFolder_2\\file.txt_2");
	      Scanner scanner = new Scanner(myDirectory);
	   
	      while(scanner.hasNextLine())
	      {
	    	  if(input.equals(scanner.nextLine().trim()))
	    	  {
	    	   System.out.println("Input already exist");
	    	   }
	    	  else{
	    		  System.out.println("Input not present ");
	    		  }
	    	  }
	      
	      
	      try {
	          Scanner myReader = new Scanner(myDirectory);
	          while (myReader.hasNextLine()) {
	            String data = myReader.nextLine();
	            System.out.println(data);
	          }
	          myReader.close();
	        } catch (FileNotFoundException e) {
	          System.out.println("An error occurred.");
	          e.printStackTrace();
	        }
	      }
	    }