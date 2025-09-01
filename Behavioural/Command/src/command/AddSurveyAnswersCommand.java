package command;

import model.FormData;

// Another CONCRETE COMMAND
public class AddSurveyAnswersCommand implements ICommand {
    private final FormData formData; // The Receiver
    private final String response;
    
    private String previousResponse;

    public AddSurveyAnswersCommand(FormData formData, String response) {
        this.formData = formData;
        this.response = response;
    }

    @Override
    public void execute() {
        System.out.println("-> EXECUTING AddSurveyAnswersCommand...");
        this.previousResponse = formData.getSurveyResponse();
        formData.setSurveyResponse(response);
    }

    @Override
    public void undo() {
        System.out.println("-> UNDOING AddSurveyAnswersCommand...");
        formData.setSurveyResponse(previousResponse);
    }
}