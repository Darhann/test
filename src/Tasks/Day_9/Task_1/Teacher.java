package Tasks.Day_9.Task_1;

public class Teacher extends Human{
    private String subject;

    public Teacher(String name,String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподователь с именем " + getName());
    }
}