package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CreateFile {
        
        public static void main(String[] args) throws IOException {
            
            /* 
             *  Creating One Directory and  Two Sub Directories(Folder_1 and Folder_2 )
             */ 
          File myDirectory=new File("C:\\New folder\\Folder1" );
             
          if (myDirectory.mkdir()) 
              {  
                 System.out.println("Folder " + myDirectory.getName() + " is created successfully."); 
                 for (int i = 1; i <= 2; i++) 
               {
                 File subfolder=new File("C:\\New folder\\Folder1\\SubFolder"+ "_"+i );
                 if (subfolder.mkdir()) 
                  { 
                     System.out.println("SubFolder " + subfolder.getName() + " is created successfully.");
                     
                  }  
                 else {  
                     System.out.println("SubFolder is already exist in the directory.");  
                      }  
               }
             
             }           
             else {  
                 System.out.println("File is already exist in the directory.");  
                  }  
        
          
         /* 
          * For Creating Two files in Folder_1
          */
          for (int i = 1; i <= 2; i++) 
          {
          File file=new File("C:\\New folder\\Folder1\\SubFolder_1\\file.txt"+ "_"+i );
          
          if(file.createNewFile()) {
              System.out.println("file1.txt " + file.getName() + " is created successfully."); 
              }
          else {  
              System.out.println("file  is already exist in the directory.");  
               }  
          }
          
          /* 
           * For Creating Two files in Folder_2
           */
          for (int i = 1; i <=2; i++) 
          {
          File file=new File("C:\\New folder\\Folder1\\SubFolder_2\\file.txt"+ "_"+i );
          
          if(file.createNewFile()) {
              System.out.println("file1.txt " + file.getName() + " is created successfully."); 
              }
          else {  
              System.out.println("file  is already exist in the directory.");  
               }  
          }

           
          
         
			 
		}}
				
