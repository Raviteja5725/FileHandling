package FileHandling;

import java.io.File;
import java.io.FileWriter;

public class Count_OF_Files {
	
	public static void main(String[] args) {
		
	
	/*
     * Getting the List and count of all files with extension .txt in Folder1
     */
		
		  File myDirectory=new File("C:\\New folder\\Folder1" );
			 File [] files=myDirectory.listFiles();
			 
			 /*
	          * for writing lines in Subfolder_2 files
	          */
	         for(File file:files) {
	             if(file.isFile()) {
	              System.out.println("File"+file.getName());
	              String[] ls=file.list(); 
	                   for(int i=0;i<ls.length;i++)
	                         {  
	                      System.out.println(ls[i]);
	                         }   
	                   }
	             else if(file.isDirectory())
	             {
	            	  System.out.println("File"+file.getName());
	                 String[] ls=file.list(); 
	                 for(int i=0;i<ls.length;i++)
	                       {
	                	 System.out.println(ls[i]);
	                       }}    
	             
	             else
	                 System.out.println("File1 is neither a file nor a directory");
	         }
		
				
    int myDirectory1=new File("C:\\New folder\\Folder1" ).list().length;
     System.out.println("Count of files"+myDirectory1);
     
}}
