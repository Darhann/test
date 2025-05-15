package Tasks.Day_7.Task_2;

import java.util.Random;

public class Player {
    public static int playerCount;
    private int stamina;
    private String name;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;

    Random random = new Random();
    public Player( String  name) {
        this.stamina = random.nextInt(90, 101);;
        this.name = name;
        playerCount++;
    }


    public static void countPlayers(){
        if (playerCount <= 6)
            System.out.println("Кол-во игроков на поле: " + playerCount);
        else
            System.out.println("На поле 6 игроков. " + (playerCount - 6) + " на запасе");
    }

    public void run(){
        stamina = stamina - 5;
        System.out.println("У игрока " + name + " осталось выносливости: " + stamina);

        if (stamina <= 0){
            System.out.println("Игрок " + name + " уохдит с поля");
            playerCount--;
        }
    }

    public static void info(){
        if (playerCount < 6){
            switch (6 - playerCount){
                case 1:
                    System.out.println("Команды неполные, еще есть " + 1 + " свободное место");
                    break;
                default:
                    System.out.println("Команды неполные, еще есть " + (6 - playerCount) + " свободных мест");
                    break;
            }
        } else
            System.out.println("Мест в командах больше нет");
    }

    public int getStamina() {
        return stamina;
    }


    public void strGetStamina(){
        if (playerCount <= 6){
            System.out.println("Выносливость игрока " + name + ": "+ getStamina());
        } else
            System.out.println( name + " запасной игрок");

    }
}
