package command;

import model.FormData;
// A CONCRETE COMMAND
public class AddContactInfoCommand implements ICommand {
    private final FormData formData; // The Receiver
    private final String name;
    private final String email;
    
    // Store previous state for a perfect undo
    private String previousName;
    private String previousEmail;

    public AddContactInfoCommand(FormData formData, String name, String email) {
        this.formData = formData;
        this.name = name;
        this.email = email;
    }

    @Override
    public void execute() {
        System.out.println("-> EXECUTING AddContactInfoCommand...");
        // Store previous state before changing it
        this.previousName = formData.getContactName();
        this.previousEmail = formData.getContactEmail();
        // Execute the action
        formData.setContactName(name);
        formData.setContactEmail(email);
    }

    @Override
    public void undo() {
        System.out.println("-> UNDOING AddContactInfoCommand...");
        // Revert to the previous state
        formData.setContactName(previousName);
        formData.setContactEmail(previousEmail);
    }
}
