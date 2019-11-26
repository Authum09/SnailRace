package Übungen;

import java.util.Arrays;

public class SnailRace {
    String name;
    int member;
    RacingSnail[] snails;
    int raceDistance;
    int firstUnused = 0 ;

    public SnailRace (String n, int m, int distance) {
        name = n;
        member = m;
        snails = new RacingSnail[m];
        raceDistance = distance;
    }

    public void addRaceSnail (RacingSnail newSnail) {
        if (firstUnused > 0) {
            snails[firstUnused] = newSnail;
            firstUnused++;
        } else {
            snails[firstUnused] = newSnail;
            firstUnused++;
        }
    }
    public RacingSnail[] getSnails() {
        return snails;
    }

    public String toString () {
        return "Rennname: " + name + '\n' + "Anzahl der Teilnehmer: " + member + '\n' + "Informationen der Schnecke: " + Arrays.toString(snails) +'\n' + "Renndistanz: " + raceDistance;
    }

    public RacingSnail determineWinner () {
        for (int i = 0; i < snails.length; i++) {
            if (snails[i].distance >= raceDistance) {
                return snails[i];
            }
            }
        return null;
    }
}
