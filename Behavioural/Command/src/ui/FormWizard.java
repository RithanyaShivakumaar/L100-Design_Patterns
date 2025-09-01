package ui;

import command.ICommand;
import model.FormData;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

// The INVOKER: It knows how to execute a command, but not what the command does.
public class FormWizard {
    private final FormData formData;
    private final List<ICommand> steps;
    private final Deque<ICommand> history = new ArrayDeque<>();
    private int currentStep = 0;

    public FormWizard(FormData formData, List<ICommand> steps) {
        this.formData = formData;
        this.steps = steps;
    }

    public void pressNext() {
        if (currentStep < steps.size()) {
            ICommand command = steps.get(currentStep);
            command.execute();
            history.push(command); // Add to history for undo
            currentStep++;
        } else {
            System.out.println("You are at the end of the form.");
        }
    }

    public void pressBack() {
        if (!history.isEmpty()) {
            ICommand lastCommand = history.pop();
            lastCommand.undo();
            currentStep--;
        } else {
            System.out.println("You are at the beginning of the form.");
        }
    }

    public void displayCurrentState() {
        System.out.println("\n----- CURRENT FORM STATE -----");
        System.out.println(formData);
        System.out.println("----------------------------\n");
    }
}