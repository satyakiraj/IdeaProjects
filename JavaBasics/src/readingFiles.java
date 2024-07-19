import java.io.*;
import java.util.Scanner;

public class readingFiles {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\Vishwa\\OneDrive\\Desktop\\trying\\file-try-1.java");
            Scanner myReader = new Scanner(myObj);
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