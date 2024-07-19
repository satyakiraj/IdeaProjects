import java.io.File;

public class javaDeletingFiles {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\Vishwa\\OneDrive\\Desktop\\trying\\file-try-1.java");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
