package Tasks;

public class Task_3 {
    public static void main(String[] args) {
        int age = 24;
        while(age <= 100){
            System.out.println("Мой возраст: " + age);
            age = age + 5;
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for(int x = 24; x <= 100; x += 5){
            System.out.println("Возраст мой: " + x);
        }
    }
}
