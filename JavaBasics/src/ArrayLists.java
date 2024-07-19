import java.util.ArrayList;
public class ArrayLists {
    //ArrayList: It's a part of the Java Collections Framework and is dynamically resizable. It can grow and shrink in size as elements are added or removed.
    //Arrays: Once created, arrays have a fixed size which cannot be changed. You need to specify the size of the array when you create it, and that size cannot be altered afterward.
    //ArrayList: Can hold objects of any type.
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>(); // we can also use new ArrayList<String>()
        //.add() is use to add elements in the array
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Range Rover");
        for (String i : cars){
            System.out.println(i + " " + "car");
        }
        //To access an element in the ArrayList, use the get() method and refer to the index number
        //.getFirstCall() is use to get the first element in the array
       System.out.println(cars.get(2));
       cars.set(0, "Porsche");
       cars.remove(3);
       for (int i = 0; i < cars.size(); i++){
           System.out.println(cars.get(i));
       }
    }
}
