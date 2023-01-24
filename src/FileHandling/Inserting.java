package FileHandling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Inserting {
	 public static void main(String[] args) throws IOException {	
		 
		 
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
                 String[] ls=file.list(); 
                 for(int i=1;i<=ls.length;i++)
                       {
                     try{    
                         FileWriter fw=new FileWriter("C:\\New folder\\Folder1\\SubFolder_1\\file.txt"+ "_"+i );    
                         fw.write("Estuate Software Company private Limited");    
                         fw.close();    
                        }
                     catch(Exception e) {
                      	  System.out.println(e);
                        }    
                        System.out.println("Success...");    
                        }  
                       
             }
             else
                 System.out.println("File1 is neither a file nor a directory");
         }
         
         
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
                 String[] ls=file.list(); 
                 for(int i=1;i<=ls.length;i++)
                       {
                     try{    
                         FileWriter fw=new FileWriter("C:\\New folder\\Folder1\\SubFolder_2\\file.txt"+ "_"+i );    
                         fw.write("Estuate Software Company private Limited");    
                         fw.close();    
                        }
                     catch(Exception e) {
                      	  System.out.println(e);
                        }    
                        System.out.println("Success...");    
                        }  
                       
             }
             else
                 System.out.println("File1 is neither a file nor a directory");
         }
	 }}