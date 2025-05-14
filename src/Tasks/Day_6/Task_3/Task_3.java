package Tasks.Day_6.Task_3;

import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        Teacher teacher = new Teacher("Анна Ивановна", "Математика");
        Student student = new Student("Борис Романов");
        teacher.Grade(2);
    }
}
