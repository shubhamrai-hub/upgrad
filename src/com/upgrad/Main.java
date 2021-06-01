package com.upgrad;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Ticket regularTicket = new RegularTicket("UK 883", "Delhi", "Chennai", null, "DepartureDateTime", "ArrivalDateTime", null, 6796, false, "15A", "Breakfast");
        Ticket touristTicket = new TouristTicket("BA 256", "Delhi", "Los Angeles", null, "DepartureDateTime", "ArrivalDateTime", null, 60865, false, "3C", "Sunset Marquis Resort", new String[]{" "});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }

}

