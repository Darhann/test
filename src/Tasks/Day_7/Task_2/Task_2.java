package Tasks.Day_7.Task_2;

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {



        Player player1 = new Player("№1");
        Player player2 = new Player("№2");
        Player player3 = new Player("№3");
        Player player4 = new Player("№4");
        Player player5 = new Player("№5");
        Player player6 = new Player("№6");
        Player player7 = new Player("№7");

        while (player1.getStamina() > 0) {
            player1.run();
        }
        player1.strGetStamina();
        player2.strGetStamina();
        player3.strGetStamina();
        player4.strGetStamina();
        player5.strGetStamina();
        player6.strGetStamina();
        player7.strGetStamina();


        Player.countPlayers();

        Player.info();

    }
}
