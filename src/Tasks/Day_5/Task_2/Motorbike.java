package Tasks.Day_5.Task_2;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    Motorbike(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public String getInfo(){
        return "Year: " + year + ". Color: " + color + ". Model: " + model;
    }
}
