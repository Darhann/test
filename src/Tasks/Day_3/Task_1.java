package Tasks.Day_3;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        String[] russian = {"Москва", "Владивосток", "Ростов"};
        String[] italy = {"Рим", "Милан", "Турин"};
        String[] england = {"Ливерпуль", "Манчестер", "Лондон"};
        String[] germany = {"Берлин", "Мюнхен", "Кёльн"};

        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            String city = scanner.nextLine();

            if (city.equals("Stop")) break;

            switch (city) {
                case "Москва", "Владивосток", "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим", "Милан", "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль", "Манчестер", "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин", "Мюнхен", "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестный страна!");
            }
        }
    }
}
