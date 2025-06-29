public class PrototypeDemo {
    public static void main(String[] args) {
        EventTicket prototype = new EventTicket("Concert Night", "", "", 99.99, "BC0000");

        EventTicket ticket1 = (EventTicket) prototype.clone();
        ticket1.setSeat("A1");
        ticket1.setHolderName("Alice");

        EventTicket ticket2 = (EventTicket) prototype.clone();
        ticket2.setSeat("A2");
        ticket2.setHolderName("Bob");

        ticket1.printTicket();
        ticket2.printTicket();
    }
}
