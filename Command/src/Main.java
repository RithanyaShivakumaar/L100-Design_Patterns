
import command.*;
import model.*;
import ui.*;
import java.util.List;

// The CLIENT: Sets up the objects and starts the process.
public class Main {
    public static void main(String[] args) {
        // 1. Create the Receiver
        FormData formData = new FormData();

        // 2. Create all the commands (steps) with the data they will use
        List<ICommand> formSteps = List.of(
            new AddContactInfoCommand(formData, "Aarav Sharma", "aarav.sharma@example.com"),
            new AddSurveyAnswersCommand(formData, "I am enjoying the product a lot!")
        );

        // 3. Create the Invoker and pass it the receiver and the steps
        FormWizard wizard = new FormWizard(formData, formSteps);

        // --- Simulate user interaction ---
        System.out.println("Starting the form wizard...");
        wizard.displayCurrentState();

        System.out.println("ACTION: User clicks 'Next' to fill contact info.");
        wizard.pressNext();
        wizard.displayCurrentState();

        System.out.println("ACTION: User clicks 'Next' to fill survey answers.");
        wizard.pressNext();
        wizard.displayCurrentState();
        
        System.out.println("ACTION: Whoops! User clicks 'Back' to change survey answer.");
        wizard.pressBack();
        wizard.displayCurrentState();
        
        System.out.println("Form Filling Complete!");
    }
}