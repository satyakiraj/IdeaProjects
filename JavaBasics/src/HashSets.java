import java.util.HashSet;
public class HashSets {
    //A HashSet is a collection of items where every item is unique
    //To check whether an item exists in a HashSet, use the contains() method
    //To remove an item, use the remove() method
    //To remove all items, use the clear() method
   public static void main(String[] args) {
       HashSet<Integer> num = new HashSet<>();
       num.add(1);
       num.add(5);
       num.add(6);
       num.add(12);
       num.add(7);
       num.add(13);
       System.out.println("Size is " + num.size());
       for (int i = 1; i <= 10; i++) {
           if (num.contains(i)) {
               System.out.println(i);
           } else {
               continue;
           }
       }
       for(Integer numbers : num){
               System.out.println(numbers);
       }
   }
}
