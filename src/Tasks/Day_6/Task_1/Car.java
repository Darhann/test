package Tasks.Day_6.Task_1;

public class Car {
    private int year;
    private String color;
    private  String model;

    public Car(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public void getInfo(){
        System.out.println("Это машина");
    }

    public void info(){
        System.out.println("Год: " + year + ". Цвет: " + color + ". Модель:" + model);
    }

    public int Diff(int scanner){
        return Math.abs(scanner - year);

    }
}
