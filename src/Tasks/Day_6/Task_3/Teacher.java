package Tasks.Day_6.Task_3;

public class Teacher {
    private String fullName;
    private String subject;

    public Teacher(String fullName, String subject) {
        this.fullName = fullName;
        this.subject = subject;
    }

    String studentFullName = Student.class.getName();

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

    public void Grade(int x) {
        switch (x) {
            case 2:
                System.out.println("Преподаватель " + fullName + " оценил студента с именем " + studentFullName + " по предмету " + subject + " на НЕУДОВЛЕТВОРИТЕЛЬНО");
                break;
            case 3:
                System.out.println("Преподаватель " + fullName + " оценил студента с именем " + studentFullName + " по предмету " + subject + " на УДОВЛЕТВОРИТЕЛЬНО");
                break;
            case 4:
                System.out.println("Преподаватель " + fullName + " оценил студента с именем " + studentFullName + " по предмету " + subject + " на ХОРОШО");
                break;
            case 5:
                System.out.println("Преподаватель " + fullName + " оценил студента с именем " + studentFullName + " по предмету " + subject + " на ОТЛИЧНО");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
