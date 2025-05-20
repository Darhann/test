package Tasks.Day_12.Task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        List<MusicBand> list1 = new ArrayList<>();

        MusicBand group1 = new MusicBand("The Beatles", 1960);
        MusicBand group2 = new MusicBand("The Rolling Stones", 1962);
        MusicBand group3 = new MusicBand("One Direction", 2010);
        MusicBand group4 = new MusicBand("Linkin Park ", 2000);
        MusicBand group5 = new MusicBand("My Chemical Romance", 2001);
        MusicBand group6 = new MusicBand("Maroon 5", 1995);
        MusicBand group7 = new MusicBand("Royal Blood", 2012);
        MusicBand group8 = new MusicBand("Arctic Monkeys", 2002);
        MusicBand group9 = new MusicBand("Imagine Dragons", 2012);
        MusicBand group10 = new MusicBand("BTS", 2013);

        list1.add(group1);
        list1.add(group2);
        list1.add(group3);
        list1.add(group4);
        list1.add(group5);
        list1.add(group6);
        list1.add(group7);
        list1.add(group8);
        list1.add(group9);
        list1.add(group10);

        System.out.println(list1);

        Collections.shuffle(list1);

        System.out.println(list1);

        List<MusicBand> list2 = new ArrayList<>();

        for (MusicBand band: list1) {
            if (band.getYear() > 2000) {
                list2.add(band);
            }
        }

        System.out.println(list2);
    }
}
