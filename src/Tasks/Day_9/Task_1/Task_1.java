package Tasks.Day_9.Task_1;

public class Task_1 {
    public static void main(String[] args) {
        Student student = new Student("Борис Романов", "Первая группа");
        Teacher teacher = new Teacher("Ольга Петровна", "Математика");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();

        System.out.println(student.getName());
        System.out.println(teacher.getName());
    }
}
