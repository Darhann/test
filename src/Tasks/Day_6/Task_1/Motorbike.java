package Tasks.Day_6.Task_1;

public class Motorbike {
    private int year;
    private String color;
    private  String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public void getInfo(){
        System.out.println("Это мотоцикл");
    }

    public void info(){
        System.out.println("Год: " + year + ". Цвет: " + color + ". Модель: " + model);
    }

    public int Diff(int scanner){
        return Math.abs(scanner - year);
    }
}
