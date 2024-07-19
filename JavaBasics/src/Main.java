//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int Sum(int a, int b){
       return a + b;
    }
    static void Age_Checker(int age){
        if (age < 18){
            System.out.println("You Cannot Vote");
        }else{
            System.out.println("You Can Vote");
        }
    }
   public static void main(String[] args){
        System.out.println(Sum(4, 7));
        Age_Checker(14);
   }
}