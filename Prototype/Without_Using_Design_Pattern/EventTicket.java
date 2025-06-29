public class EventTicket {
    private String eventName;
    private String seat;
    private String holderName;
    private double price;
    private String barcode;

    public EventTicket(String eventName, String seat, String holderName, double price, String barcode) {
        this.eventName = eventName;
        this.seat = seat;
        this.holderName = holderName;
        this.price = price;
        this.barcode = barcode;
    }

    private String generateUniqueBarcode() {
        return "BC" + System.nanoTime();
    }

    public void printTicket() {
        System.out.println("Event: " + eventName);
        System.out.println("Seat: " + seat);
        System.out.println("Holder: " + holderName);
        System.out.println("Price: $" + price);
        System.out.println("Barcode: " + barcode);
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        EventTicket ticket1 = new EventTicket("Concert Night", "A1", "Alice", 99.99, "BC" + System.nanoTime());
        EventTicket ticket2 = new EventTicket("Concert Night", "A2", "Bob", 99.99, "BC" + System.nanoTime());

        ticket1.printTicket();
        ticket2.printTicket();
    }
}
