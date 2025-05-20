package Tasks.Day_12.Task_4;


import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Grace Slick");
        members1.add("Marty Balin");
        members1.add("Paul Kantner");
        members1.add("Jorma Bishop");
        members1.add("Jack Loarel");
        members1.add("James Bond");

        MusicBand band1 = new MusicBand("Jefferson Airplane", 1998, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("John Lennon");
        members2.add("Richard Candy");
        members2.add("Mike Trich");
        members2.add("Kyle Jenner");

        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
