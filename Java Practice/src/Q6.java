public class Q6 {
    public static void main(String[] args){
        double numArray[] = {45, 56, 67.76, 78.78, 99, 85.65, 45, 32};
        double total = 0;
        for (double i : numArray){
            total += i;
        }
        double average = total/ numArray.length;
        String formattedNumber = String.format("%.5f", average);
        System.out.println(formattedNumber);
    }
}
