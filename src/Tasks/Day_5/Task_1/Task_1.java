package Tasks.Day_5.Task_1;

public class Task_1 {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setYear(2017);
        bmw.setColor("Black");
        bmw.setModel("X7");

        System.out.println(bmw.getYear());
        System.out.println(bmw.getColor());
        System.out.println(bmw.getModel());
    }
}
