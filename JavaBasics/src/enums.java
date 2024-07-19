public class enums {
    enum Cars {
        car1,
        car2,
        car3
    }

    public static void main(String[] args) {
        Cars myObj = Cars.car1;
        System.out.println(myObj);
        switch (myObj) {
            //you can also use : after car1
            case car1:
                System.out.println("Car is Ford");
                break;
            case car2:
                System.out.println("Car is BMW");
                break;
            case car3:
                System.out.println("Car is Mercedes");
                break;
            default:
                System.out.println("No Car");
        }
        //The enum type has a values() method, which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum
        for (Cars myVar : Cars.values()){
            System.out.println(myVar + " " + "car");
        }
    }
}
