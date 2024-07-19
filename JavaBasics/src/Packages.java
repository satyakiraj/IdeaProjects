import java.util.Scanner;
//util is the name of the package
//Scanner is the name of the class
//To import a whole package, end the sentence with an asterisk sign (*). Ex- import java.util.*;
public class Packages {
    public static void main(String[] args){
        //it calls the Scanner constructor and gives the input through System.in
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username:");
        //nextLine() method, which is used to read a complete line
        String name = myObj.nextLine();
        System.out.println("Hello" + " " +name);
    }
}
