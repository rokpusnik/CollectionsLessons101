package com.conology;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[]s) {
        Theatre theatre = new Theatre("Olympian", 8,12);

        reserveMySeat(theatre,"D12");
        reserveMySeat(theatre,"D12");
        reserveMySeat(theatre,"B13");



        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13d));
        priceSeats.add(theatre.new Seat("A00", 13d));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);


        //wrong! - newList needs to be initialized with seats before Collections.copy works
        //List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
        //Collections.copy(newList, theatre.seats);
    }
    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("=====================================================================");
    }
    public static void reserveMySeat(Theatre theatre, String seatDesignation) {
        if(theatre.reserveSeat(seatDesignation)) {
            System.out.println("please pay for " + seatDesignation);
        } else {
            System.out.println("seat " + seatDesignation + " is already reserved");
        }
    }
}
