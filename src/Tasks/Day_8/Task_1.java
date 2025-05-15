package Tasks.Day_8;

public class Task_1 {
    public static void main(String[] args) {
        String numbers = "";

        long before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++){
            numbers = numbers + " " + i;
        }

        long after = System.currentTimeMillis();

        System.out.println(after - before);

        StringBuilder builder = new StringBuilder("");

        before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++){
            builder.append(" ").append(i);
        }

        after = System.currentTimeMillis();

        System.out.println(after - before);


    }
}
