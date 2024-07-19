public class Recursion {
    static int multiply_range(int num) {

        if (num > 0) {
            return num * multiply_range(num - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        int product = multiply_range(15);
        System.out.println(product);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}