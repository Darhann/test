package Tasks.Day_4;

import java.util.Arrays;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(50);
            }
        }

        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < matrix.length; i++){
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }
        }
        System.out.println("Индекс строки maxSumIdx: " + maxSumIdx);
    }
}
