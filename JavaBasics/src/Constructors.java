public class Constructors {
    String model;
    String Year;
    String Color;
    public Constructors(String a, String b, String c){
        model = a;
        Year = b;
        Color = c;
    }
    public static void main(String[] args){
        Constructors myCar = new Constructors("Mustang", "2015", "Red");
        System.out.println(myCar.model);
        System.out.println(myCar.Year);
        System.out.println(myCar.Color);
    }
}
