
package prototype;

import interfaces.TicketPrototype;

public class EventTicket implements TicketPrototype {
    // Core ticket properties that remain the same across all tickets for an event
    private String eventName;    // Event name (same for all tickets)
    private String seat;         // Seat number (different for each ticket)
    private String holderName;   // Ticket holder name (different for each ticket)
    private double price;        // Ticket price (same for all tickets)
    private String barcode;      // Unique barcode (different for each ticket)

    public EventTicket(String eventName, String seat, String holderName, double price, String barcode) {
        this.eventName = eventName;
        this.seat = seat;
        this.holderName = holderName;
        this.price = price;
        this.barcode = barcode;
    }

    @Override
    public TicketPrototype clone() {
        // Create new ticket with same event details but unique seat, holder, and barcode
        return new EventTicket(eventName, seat, holderName, price, generateUniqueBarcode());
    }

    private String generateUniqueBarcode() {
        return "BC" + System.nanoTime();
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public void setHolderName(String name) {
        this.holderName = name;
    }

    @Override
    public void printTicket() {
        System.out.println("Event: " + eventName);
        System.out.println("Seat: " + seat);
        System.out.println("Holder: " + holderName);
        System.out.println("Price: $" + price);
        System.out.println("Barcode: " + barcode);
        System.out.println("----------------");
    }
}