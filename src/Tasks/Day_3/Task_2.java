package Tasks.Day_3;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            if (y == 0) break;

            System.out.println(x / y);
        }
    }
}
