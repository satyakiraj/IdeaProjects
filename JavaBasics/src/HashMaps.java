import java.util.HashMap;

public class HashMaps {
    //A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type
    //One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values
    //To remove an item, use the remove() method and refer to the key
    //To remove all items, use the clear() method
    //To remove all items, use the clear() method
    //Use the keySet() method if you only want the keys, and use the values() method if you only want the values
    //One object is used as a key (index) to another object (value).
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();
        items.put("t-shirt", 45);
        items.put("pants", 50);
        items.put("toys", 80);
        // items.remove("pants");
        System.out.println(items);
        System.out.println("$" + items.get("t-shirt"));
        System.out.println(items.size());
        for (String i : items.keySet()) {
            System.out.println(i + ":" + " " + "$" + items.get(i));
        }
        for (Integer a : items.values()) {
            System.out.println(a);
        }
    }
}