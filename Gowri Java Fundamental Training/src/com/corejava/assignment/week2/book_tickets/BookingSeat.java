package com.corejava.assignment.week2.book_tickets;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookingSeat {

    public static void main(String[] args) {

        Theater jewel = new Theater(3, 4);
        printSeats(jewel);
        jewel.bookSeat('A',1);
        jewel.bookSeat('A',2);
        jewel.bookSeat('A',3);
        jewel.bookSeat('A',4);
        jewel.bookSeat('B',1);
        jewel.bookSeat('B',3);
        jewel.bookSeat('B',2);
        jewel.bookSeat('B',4);
        System.out.println();

        printAvailableTickets(jewel);
    }

    public static void printAvailableTickets(Theater theater) {
        System.out.println("Available Tickets Printing:\n");
        theater.getSeats().stream()
                .filter(Seat::isAvailable)
                .forEach(seat -> {
                    System.out.println("****** TICKET *******");
                    System.out.println("Seat " + seat.toString()+
                            " Price: $ "+ seat.getPrice()+ "0");
                    System.out.println("*********************\n");
                });
    }

    public static void printSeats(Theater theater) {
        int numOfSeats = theater.getSeats().size();
        for (int i = 0; i < numOfSeats; i++) {
            Seat seat = theater.getSeats().get(i);
            if (seat.getNum() != theater.seatsPerRow-1) {
                System.out.print(seat.toString()+ " ");
            } else {
                System.out.print(seat.toString()+ " \n");
            }
        }
        System.out.println("***** SCREEN *****\n");
    }
}

class Theater {
    int rows;
    int seatsPerRow;
    List<Seat> seats = new ArrayList<>();

    public Theater(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
        for (char i='A'; i<65+rows; i++){
            for (int j=0; j<seatsPerRow;j++){
                seats.add(new Seat(i,j));
            }
        }
    }

    public void bookSeat(Seat seat) {
        seat.setAvailable(false);
    }

    public void bookSeat(char row, int num) {
        Seat booked = seats.get((((row-65)*(seatsPerRow))+ (num))-1);
        booked.setAvailable(false);
        System.out.println(booked.toString()+ " is booked!");
    }

    public List<Seat> getSeats() {
        return seats;
    }
}

class Seat {
    char row;
    int num;
    boolean isAvailable;
    double price;
    public Seat(char row, int num) {
        this.row = row;
        this.num = num;
        isAvailable = true;
        price = 8.50d;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "" + row + (num+1);
    }
}
