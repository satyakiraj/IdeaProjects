public class Q4 {
    public static String reverse_String(String word) {
        if (word.isEmpty()) {
            return "Enter A Word";
        }
        else if(word.length() == 1){
            return word;
        }
        return word.charAt(word.length() - 1) + reverse_String(word.substring(0, word.length() - 1));
    }

    public static void main(String[] args) {
        String result = reverse_String("John Doe");
        System.out.println(result);
    }
}