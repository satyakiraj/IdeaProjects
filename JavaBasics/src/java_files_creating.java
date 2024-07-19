import java.io.*;
public class java_files_creating {
    //To create a file in Java, you can use the createNewFile() method. This method returns a boolean value: true if the file was successfully created, and false if the file already exists. Note that the method is enclosed in a try...catch block. This is necessary because it throws an IOException if an error occurs (if the file cannot be created for some reason)
    //To create a file in a specific directory (requires permission), specify the path of the file and use double backslashes to escape the "\" character
   public static void main(String[] args){
       File fileObj = new File("C:\\Users\\Vishwa\\OneDrive\\Desktop\\trying\\file-try-1.txt");
       try {
           if (fileObj.createNewFile()) {
               System.out.println("File: " + fileObj.getName() + " is created successfully");
           }else{
               System.out.println("File is already present in the directory");
           }
       }catch (IOException e){
           //The printStackTrace() method in Java is a tool used to handle exceptions and errors. It is a method of Java's throwable class which prints the throwable along with other details like the line number and class name where the exception occurred.
           System.out.println("An error Occurred");
           e.printStackTrace();
       }

   }
}
