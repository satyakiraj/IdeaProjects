import java.io.*;
import java.util.Scanner;
public class FileManger {
    public static void main(String[] args) {
        // finding files
        String dir = "";
        String fullPath = "";
        Scanner myObj = new Scanner(System.in);
        System.out.println("Where Is this file/folder (D -> Desktop/ DL -> Download/PF - Program Files):");
        String selected = myObj.nextLine();
        switch (selected) {
            case "D":
                dir = "Desktop";
                fullPath = "C:\\Users\\Vishwa\\OneDrive\\Desktop";
                break;
            case "DL":
                dir = "Downloads";
                fullPath = "Downloads";
                break;
            case "PF":
                dir = "Program Files";
                fullPath = "C:\\Program Files";
                break;
            default:
                System.out.println("Invalid Value");
        }
        File directory = new File(fullPath);
        File[] listOfFiles = directory.listFiles();
        for (File file: listOfFiles){
            if (file.isFile()){
                System.out.println("File: " + file.getName());
            }
            else if(file.isDirectory()){
                System.out.println("Folder: " + file.getName());
            }
        }
    }
}
