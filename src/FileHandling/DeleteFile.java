package FileHandling;

import java.io.File;

public class DeleteFile {
public static void main(String[] args) {
	
	 File myDirectory=new File("C:\\New folder\\Folder1\\SubFolder_2\\file.txt_1");
	  if(myDirectory.exists()) {
		  System.out.println("file exists");
	  }
	  else {
		  System.out.println("file not exists");
	}
	  if (myDirectory.delete()) { 
	      System.out.println("Deleted the file: " + myDirectory.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	  } 
	}


