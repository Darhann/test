package Tasks.Day_6.Task_2;

public class Task_2 {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("USA", 2002, 30, 40);
        boeing.setYear(2010);
        boeing.setLength(25);
        boeing.fillUp(45);
        boeing.fillUp(35);
        boeing.fillUp(20);
        boeing.info();
    }
}
