interface Interfaces {
    void color(String car_color);
}

interface Model {
    void model_name(String car_model);
}

class Car_model implements Interfaces, Model {
    @Override
    public void color(String car_color) {
        System.out.println("Car Color is " + car_color);
    }

    @Override
    public void model_name(String car_model) {
        System.out.println("Car Model is " + car_model);
    }
    public static void main(String[] args) {
        Car_model myCarModel = new Car_model();
        myCarModel.model_name("Ford Mustang");
        myCarModel.color("Red");
    }
}
