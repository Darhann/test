package Tasks.Day_7.Task_1;

public class Airplane1 {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int capacity;

    public Airplane1(String manufacturer, int year, int length, int weight) {
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void compareAirplanes(Airplane1 airplane1, Airplane1 airplane2) {
        if (airplane1.getLength() > airplane2.getLength())
            System.out.println("Первый самолет длинне на " + (airplane1.getLength() - airplane2.getLength()) + "м");
        else if (airplane1.getLength() < airplane2.getLength())
            System.out.println("Второй самолет длинне на "+ (airplane2.getLength() - airplane1.getLength()) + "м");
        else
            System.out.println("Длины самолетов равны");
    }
}
