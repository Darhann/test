package Tasks.Day_4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        int[] massive = new int[quantity];

        for (int i = 0; i < massive.length; i++){
            massive[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(massive));

        System.out.println();
        System.out.println("Длина массива: " + massive.length);

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 0; i < massive.length; i++){
            if (massive[i] > 8) {
                count1++;
            }
        }
        System.out.println("Кол-во чисел больше 8 -> " + count1);

        for (int i = 0; i < massive.length; i++){
            if (massive[i] == 1) {
                count2++;
            }
        }
        System.out.println("Кол-во чисел равных 1 -> " + count2);

        for (int i = 0; i < massive.length; i++){
            if (massive[i] %2 == 0) {
                count3++;
            }
        }
        System.out.println("Кол-во четных чисел -> " + count3);

        for (int i = 0; i < massive.length; i++){
            if (massive[i] %2 != 0) {
                count4++;
            }
        }
        System.out.println("Кол-во нечетных чисел -> " + count4);

        int sum = 0;

        for (int i = 0; i < massive.length; i++){
            sum = sum + massive[i];
        }
        System.out.println("Сумма всех элементов массива -> " + sum);
    }
}
