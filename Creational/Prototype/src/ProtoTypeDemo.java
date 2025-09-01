import prototype.EventTicket;

public class ProtoTypeDemo {
    public static void main(String[] args) {
        System.out.println("=== PROTOTYPE PATTERN DEMONSTRATION ===\n");
        
        // STEP 1: Create the prototype ticket (template)
        // This is the "master copy" that will be cloned for all other tickets
        // Notice: seat and holderName are empty - they'll be customized for each clone
        EventTicket prototype = new EventTicket("Concert Night", "", "", 99.99, "BC0000");
        System.out.println("Created prototype ticket for 'Concert Night' at $99.99");
        System.out.println("Prototype created - this is our template!\n");

        // STEP 2: Clone the prototype for Alice's ticket
        // Instead of calling: new EventTicket("Concert Night", "A1", "Alice", 99.99, barcode)
        // We clone the prototype and customize only what's different
        EventTicket ticket1 = (EventTicket) prototype.clone();
        ticket1.setSeat("A1");           // Customize: assign specific seat
        ticket1.setHolderName("Alice");  // Customize: assign specific holder
        
        System.out.println("Cloned ticket for Alice:");
        System.out.println("- Same event: Concert Night");
        System.out.println("- Same price: $99.99");
        System.out.println("- Custom seat: A1");
        System.out.println("- Custom holder: Alice");
        System.out.println("- Unique barcode: " + ticket1.toString().split("@")[1] + "\n");

        // STEP 3: Clone the prototype for Bob's ticket
        // Again, we clone instead of creating from scratch
        EventTicket ticket2 = (EventTicket) prototype.clone();
        ticket2.setSeat("A2");         // Customize: assign specific seat
        ticket2.setHolderName("Bob");  // Customize: assign specific holder
        
        System.out.println("Cloned ticket for Bob:");
        System.out.println("- Same event: Concert Night");
        System.out.println("- Same price: $99.99");
        System.out.println("- Custom seat: A2");
        System.out.println("- Custom holder: Bob");
        System.out.println("- Unique barcode: " + ticket2.toString().split("@")[1] + "\n");

        // STEP 4: Display both tickets to show the results
        System.out.println("=== FINAL TICKETS ===");
        ticket1.printTicket();
        ticket2.printTicket();
        
        System.out.println("=== PATTERN BENEFITS ===");
        System.out.println("✓ Both tickets share the same event name and price");
        System.out.println("✓ Each ticket has unique seat, holder, and barcode");
        System.out.println("✓ Created efficiently by cloning, not reconstructing");
        System.out.println("✓ Easy to create more tickets from the same prototype");
    }
}
