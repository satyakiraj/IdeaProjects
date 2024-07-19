import java.io.*;
public class java_files_writing {
    public static void main(String[] args) {
        try{
            FileWriter file = new FileWriter("C:\\Users\\Vishwa\\OneDrive\\Desktop\\trying\\Main.java");
              file.write("public class Main {\n" +
                      "  public static void main(String[] args) {\n" +
                      "    System.out.println(\"Hello World\");\n" +
                      "  }\n" +
                      "}\n");
              file.close();
            System.out.println("File Successfully created");
            FileWriter Calculator = new FileWriter("C:\\Users\\Vishwa\\OneDrive\\Desktop\\trying\\Calculator.java");
            Calculator.write("import java.util.Scanner;\n" +
                    "\n" +
                    "public class Calculator {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        Scanner scanner = new Scanner(System.in);\n" +
                    "\n" +
                    "        do {\n" +
                    "            System.out.println(\"Enter number 1:\");\n" +
                    "            int num1 = Integer.parseInt(scanner.nextLine());\n" +
                    "\n" +
                    "            System.out.println(\"Enter number 2:\");\n" +
                    "            int num2 = Integer.parseInt(scanner.nextLine());\n" +
                    "\n" +
                    "            System.out.println(\"1: Add\");\n" +
                    "            System.out.println(\"2: Subtract\");\n" +
                    "            System.out.println(\"3: Multiply\");\n" +
                    "            System.out.println(\"4: Divide\");\n" +
                    "\n" +
                    "            System.out.println(\"Enter your choice (1/2/3/4):\");\n" +
                    "            int choice = Integer.parseInt(scanner.nextLine());\n" +
                    "\n" +
                    "            switch (choice) {\n" +
                    "                case 1:\n" +
                    "                    System.out.println(\"Result: \" + (num1 + num2));\n" +
                    "                    break;\n" +
                    "                case 2:\n" +
                    "                    System.out.println(\"Result: \" + (num1 - num2));\n" +
                    "                    break;\n" +
                    "                case 3:\n" +
                    "                    System.out.println(\"Result: \" + (num1 * num2));\n" +
                    "                    break;\n" +
                    "                case 4:\n" +
                    "                    if (num2 != 0) {\n" +
                    "                        System.out.println(\"Quotient: \" + ((double) num1 / num2));\n" +
                    "                    } else {\n" +
                    "                        System.out.println(\"Error: Division by zero\");\n" +
                    "                    }\n" +
                    "                    break;\n" +
                    "                default:\n" +
                    "                    System.out.println(\"Invalid choice.\");\n" +
                    "            }\n" +
                    "\n" +
                    "            System.out.println(\"Do you want to continue? (yes/no):\");\n" +
                    "        } while (scanner.nextLine().equalsIgnoreCase(\"yes\"));\n" +
                    "\n" +
                    "        scanner.close();\n" +
                    "    }\n" +
                    "}");
            Calculator.close();
            System.out.println("File Successfully created");
        }catch (IOException e){
            System.out.println("An Error Occurred");
        e.printStackTrace();
    }
}
}