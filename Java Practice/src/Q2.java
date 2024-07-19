public class Q2 {
    public static int sum(int num){
        if(num == 0){
            return num;
        }
        return num + sum(num - 1);
    }
    public static void main(String[] args){
        int result = sum(7);
        System.out.println(result);
    }
}
