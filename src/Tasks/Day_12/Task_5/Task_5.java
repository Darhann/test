package Tasks.Day_12.Task_5;

import java.util.ArrayList;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Marty Balin", 36));
        members1.add(new MusicArtist("Konor McGregor", 30));
        members1.add(new MusicArtist("Paul Kantner", 41));
        members1.add(new MusicArtist("Jorma Bishop", 28));
        members1.add(new MusicArtist("Jack Loarel", 33));
        members1.add(new MusicArtist("James Bond", 47));

        MusicBand band1 = new MusicBand("Jefferson Airplane", 1998, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("John Lennon", 25));
        members2.add(new MusicArtist("Richard Candy", 33));
        members2.add(new MusicArtist("Mike Trich", 42));
        members2.add(new MusicArtist("Kyle Jenner", 45));

        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
