package Tasks.Day_6.Task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scanner = sc.nextInt();

        Car audi = new Car(1999, "Green", "A6");
        Motorbike bike = new Motorbike(2025, "Red", "Kawasaki");

        bike.getInfo();
        bike.info();
        System.out.println(bike.Diff(scanner));
        audi.getInfo();
        audi.info();
        System.out.println(audi.Diff(scanner));

    }
}
