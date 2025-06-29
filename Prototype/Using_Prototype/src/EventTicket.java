class EventTicket implements TicketPrototype {
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

    @Override
    public TicketPrototype clone() {
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