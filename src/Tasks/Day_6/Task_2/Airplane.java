package Tasks.Day_6.Task_2;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int capacity;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.capacity = 0;
    }

    public void info(){
        System.out.println("Изготовитель: "+ manufacturer + ", год выпуска: " + year + ", длина: " + length + " м" + ", вес: " + weight + " тонн" + ", Объем топлива в баке: " + capacity);
    }

    public int fillUp(int fuel){
        capacity += fuel;
        return capacity;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
