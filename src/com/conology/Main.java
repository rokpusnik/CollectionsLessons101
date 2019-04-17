package com.conology;

public class Main {
    public static void main(String[]s) {
        Theatre theatre = new Theatre("Olympian", 8,12);
        theatre.getSeats();
        if (theatre.reserveSeat("E12")) {
            System.out.println("alright!");
        } else {
            System.out.println("nah, already reserved mate");
        }
    }
}
