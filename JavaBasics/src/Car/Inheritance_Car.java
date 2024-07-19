package Car;

public class Inheritance_Car {
     String brand = "BMW";
    public void speed(String speed_car) {
        System.out.println("Speed of car: " + speed_car);
    }
}

class model extends Inheritance_Car {
     String model_name = "730li";

    public static void main(String[] args) {
        model car_detail = new model();
        System.out.println(car_detail.brand + " " + car_detail.model_name);
        car_detail.speed("250hp");
    }
}
