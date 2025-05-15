package Tasks.Day_7.Task_1;

public class Task_1 {
    public static void main(String[] args) {
        Airplane1 airplane1 = new Airplane1("Boeing", 2010, 35, 35);
        Airplane1 airplane2 = new Airplane1("USA", 2015, 30, 40);

        Airplane1.compareAirplanes(airplane1, airplane2);
    }
}
