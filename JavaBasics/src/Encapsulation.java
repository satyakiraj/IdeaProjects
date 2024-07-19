public class Encapsulation {
    // this keyword is used to refer to the current object.
    //to use it write get or set and the name of the variable.
    private String gas;

    public String getGas() {
        return gas;
    }

    public void setGas(String value) {
        int num = Integer.parseInt(value.substring(0, value.length() - 1));
        if (num > 100) {
            this.gas = "Tank is 100% full";
        } else if (num < 0 || num == 0) {
            this.gas = "Tank is Empty";
        } else {
            this.gas = "Tank is" + " " + num + "%" + " " + "full";
        }
    }

    public static void main(String[] args) {
        Encapsulation car_gas = new Encapsulation();
        car_gas.setGas("85L");
        System.out.println(car_gas.getGas());
    }
}
