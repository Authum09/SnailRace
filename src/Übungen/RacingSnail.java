package Übungen;

import java.util.Random;

public class RacingSnail {
    String name;
    String breed;
    int maxSpeed;
    int distance;

    public RacingSnail (String n,String b,int speed) {
        name = n;
        breed = b;
        maxSpeed = speed;
        distance = 0;
    }
    public int crawl () {
        Random generator = new Random();
        distance = generator.nextInt(maxSpeed) ;
        return distance;
    }
    public String toString () {
        return "Name: "+ name +'\n' +"Rasse: "+ breed +'\n'+ "Maximale Geschwindigkeit: " + maxSpeed + "m / min" +'\n'+ "Zurückgelegte Distanz: " + distance + "m" + '\n';
    }
}
