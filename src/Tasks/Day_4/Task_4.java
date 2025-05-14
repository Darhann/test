package Tasks.Day_4;

import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        int[] array = new int[100];   //пример {1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254};
        Random random = new Random();

        for (int i = 0; i < array.length; i ++){
            array[i] = random.nextInt(10000);
        }

        int sum = 0;
        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 1; i < array.length - 1; i++){
            sum = array[i - 1] + array[i] + array[i + 1];
            if (sum > maxSum){
                maxSum = sum;
                maxSumIdx = i - 1;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumIdx);
    }
}
