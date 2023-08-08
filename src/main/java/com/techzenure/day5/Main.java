/**
 * program to Calculate Ticket Price - Static
 * @author Devaraju
 * @since 26th July 2023
 */

package com.techzenure.day5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of bookings: ");
        int bookings = sc.nextInt();

        System.out.print("Enter the available tickets: ");
        int availableTickets = sc.nextInt();

       Ticket ticket = new Ticket();
       ticket.setAvailableTickets(availableTickets);

       for (int i = 0; i < bookings; ++i) {
           System.out.print("Enter the ticketid: ");
           int ticketId = sc.nextInt();

           System.out.print("Enter the price: ");
           int price = sc.nextInt();

           System.out.print("Enter the no of tickets: ");
           int tickets = sc.nextInt();

           ticket.setTicketid(ticketId);
           ticket.setPrice(price);

           System.out.println("Available tickets: " + ticket.getAvailableTickets());

           int cost = ticket.calculateTicketCost(tickets);
           System.out.println("Total amount: " + cost);
           System.out.println("Available ticket after booking: " + ticket.getAvailableTickets());
           System.out.println();
       }
    }
}