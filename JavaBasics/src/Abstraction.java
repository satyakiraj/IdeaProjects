abstract class Abstraction {
    public abstract void speed(String speed);
    public void model(String model){
        System.out.println("Model of car" + " " + model);
    }
}
class ford extends Abstraction{
    public void speed(String speed){
        System.out.println("Speed of car" + " " + speed);
    }
}
class Car {
   public static void main (String[] args){
       ford car = new ford();
       car.model("Ford Mustang");
       car.speed("250hp");
   }
}