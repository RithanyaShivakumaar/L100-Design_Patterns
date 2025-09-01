package model;

public class FormData {
    private String contactName;
    private String contactEmail;
    private String surveyResponse;

    // Getters and Setters...
    public String getContactName() { return contactName; }
    public void setContactName(String contactName) { this.contactName = contactName; }
    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) { this.contactEmail = contactEmail; }
    public String getSurveyResponse() { return surveyResponse; }
    public void setSurveyResponse(String surveyResponse) { this.surveyResponse = surveyResponse; }

    @Override
    public String toString() {
        return "FormData {" +
                "\n  contactName='" + contactName + '\'' +
                ",\n  contactEmail='" + contactEmail + '\'' +
                ",\n  surveyResponse='" + surveyResponse + '\'' +
                "\n}";
    }
}