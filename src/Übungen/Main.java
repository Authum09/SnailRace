package Übungen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RacingSnail r1 = new RacingSnail("Ulrich","Tigerschnecke",50);
        RacingSnail r2 = new RacingSnail("Peter","Weinbergschnecke",40);
        RacingSnail r3 = new RacingSnail("Andreas","Nacktschnecke", 55);
         SnailRace sr1 = new SnailRace("Schneckenrennen",3,500);
        sr1.addRaceSnail(r1);
        sr1.addRaceSnail(r2);
        sr1.addRaceSnail(r3);
        System.out.println(sr1.toString());

    }
}
