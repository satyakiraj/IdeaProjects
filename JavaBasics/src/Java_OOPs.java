public class Java_OOPs {
    //static method doesn't require new object to create using a class whereas public method requires.
    String model;
    String color;
    String speed;
    String bhp;

    static void brakes() {
        System.out.println("breaks applied");
    }

    public void review() {
        System.out.println("4.8/5");
    }
   static class test{
        public void print(String Name){
            System.out.println("Hello" + " " + Name);
        }
   }
    public static void main(String[] args) {
        Java_OOPs car = new Java_OOPs();
        car.model = "Mustang";
        car.color = "red";
        car.speed = "200hp";
        brakes();
        car.bhp = "164.97bhp";
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.speed);
        brakes();
        System.out.println(car.bhp);
        car.review();
        test greet = new test();
        greet.print("John Doe");
    }
}
