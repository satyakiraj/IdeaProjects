public class Q5 {
    static String[] shuffle(String[] arr){
        int current_index = arr.length;
        while (current_index != 0){
            int random_index = ((int) (Math.random() * arr.length));
            current_index--;
            String temp = arr[current_index];
            arr[current_index] = arr[random_index];
            arr[random_index] =  temp;
        }
        return arr;
    }
    public static void main(String[] args){
        String[] array = {"A", "B", "C", "D", "E"};
        String[] result = shuffle(array);
       for (String i : result){
           System.out.println(i);
       }
    }
}