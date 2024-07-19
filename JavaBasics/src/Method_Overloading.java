public class Method_Overloading {
    static double main_double(double a, double b) {
        return a * b;
    }

    static int main_int(int a, int b) {
        return a * b;
    }
  public static void main(String[] args){
        System.out.println(main_int(4, 7));
        System.out.println(main_double(4.956221, 7.45772));
  }
}