public class Q1 {
    public static int calculate_factorial(int num){
        if(num == 0 || num == 1){
            return num;
        }
        return num * calculate_factorial(num - 1);
    }
    public static void main(String[] args){
        int factorial = calculate_factorial(10);
        System.out.println(factorial);
    }
}