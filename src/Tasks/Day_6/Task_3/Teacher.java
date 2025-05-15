package Tasks.Day_6.Task_3;

import java.util.Random;

public class Teacher {
    private String fullName;
    private String subject;

    public Teacher(String fullName, String subject) {
        this.fullName = fullName;
        this.subject = subject;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public void Grade(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(2, 6);

        switch (randomValue) {
            case 2:
                System.out.println("Преподаватель " + fullName + " оценил студента с именем " + student.getFullName() + " по предмету " + subject + " на НЕУДОВЛЕТВОРИТЕЛЬНО");
                break;
            case 3:
                System.out.println("Преподаватель " + fullName + " оценил студента с именем " + student.getFullName() + " по предмету " + subject + " на УДОВЛЕТВОРИТЕЛЬНО");
                break;
            case 4:
                System.out.println("Преподаватель " + fullName + " оценил студента с именем " + student.getFullName() + " по предмету " + subject + " на ХОРОШО");
                break;
            case 5:
                System.out.println("Преподаватель " + fullName + " оценил студента с именем " + student.getFullName() + " по предмету " + subject + " на ОТЛИЧНО");
                break;
            default:
                System.out.println("Ошибка");
        }

            System.out.println(randomValue);
    }
}
