
package ru.avalon.java.dev.j10.labs.randomizers;
import java.util.Date;
/**
 *
 * @author sera
 */
public class RandomDate {

    public static int randomIntRange(int min, int max) {
        return min + (int) Math.round(Math.random() * (max - min));
    }

    public static long createRandomDate(int fromYear, int toYear) {
        int day = randomIntRange(1, 30);
        int month = randomIntRange(1, 12);
        int year = randomIntRange(fromYear, toYear);
        int hours = randomIntRange(0, 24);
        int min = randomIntRange(0, 60);
        int sec = randomIntRange(0, 60);
        return Date.UTC(year, month, day, hours, min ,sec);
    }
}

