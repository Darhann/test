import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\User\\Desktop\\ggg.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String [] numbers = line.split(" ");

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
