public class Q3 {
    static void palindrome(String word){
        if(word.length() == 1){
            System.out.println("A Palindrome");
        } else if (word.isEmpty()) {
            System.out.println("Enter A Word");
        }
        else if(!(word.charAt(0) == word.charAt(word.length() - 1))){
            System.out.println("Not A Palindrome");
        }else{
            palindrome(word.substring(1, word.length() - 1));
        }
    }
    public static void main(String[] args){
        palindrome("willow");
        palindrome("level");
    }
}
