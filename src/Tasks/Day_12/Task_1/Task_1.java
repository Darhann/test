package Tasks.Day_12.Task_1;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Audi");
        list.add("BMW");
        list.add("Toyota");
        list.add("Lada");
        list.add("Mercedes");

        System.out.println(list);

        list.add(2, "Tesla");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);
    }
}
