public class Polymorphism_Animal_example {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Polymorphism_Animal_example {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Polymorphism_Animal_example {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Animals {
    public static void main(String[] args) {
        Polymorphism_Animal_example myAnimal = new Polymorphism_Animal_example();
        Polymorphism_Animal_example myPig = new Pig();
        Polymorphism_Animal_example myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}