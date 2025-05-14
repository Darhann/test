package Tasks.Day_4;

import java.util.Arrays;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Максимальное значение: " + max);

        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("Минимальное значение: " + min);

        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] %10 == 0){
                count++;
            }
        }
        System.out.println("Кол-во элементов оканчивающихся на 0 -> " + count);

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] %10 == 0){
                sum += array[i];
            }
        }
        System.out.println("Сумма элементов оканчивающихся на 0 -> " + sum);
    }
}
