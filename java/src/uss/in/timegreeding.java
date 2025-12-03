package uss.in;

import java.time.LocalTime;

public class timegreeding {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();

        if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning, bro! ☀️");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Good Afternoon, bro! 🌤️");
        } else if (hour >= 17 && hour < 21) {
            System.out.println("Good Evening, bro! 🌇");
        } else {
            System.out.println("Good Night, bro! 🌙");
        }
    }
}
