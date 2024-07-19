public class classes {
    String fname;

    public classes(String value) {
        fname = value;
    }

    class last_name {
        String lname;

        public last_name(String value) {
            lname = value;
        }
    }

    public static void main(String[] args) {
        classes class1 = new classes("Satyaki");
        classes.last_name class2 = class1.new last_name("Raj");
        System.out.println(class1.fname + " " + class2.lname);
    }
}
