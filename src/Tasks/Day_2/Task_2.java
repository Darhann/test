package Tasks.Day_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        for(int i = a + 1; i < b; i++){
            if (i % 5 == 0 && i % 10 != 0){
                System.out.print(i + " ");
            }
        }
    }
}