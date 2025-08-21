package reports;

public abstract class AbstractReport {

    // Template Method
    public final void generateReport() {
        beforeReport();           // hook
        fetchData();              // abstract
        parseData();              // abstract
        analyzeData();            // optional - shared
        composeReport();          // optional - shared
        sendReport();             // optional - default
        afterReport();            // hook
    }

    // Abstract steps - must be implemented by subclasses
    protected abstract void fetchData();
    protected abstract void parseData();

    // Optional steps - base class implementation shared by all
    protected void analyzeData() {
        System.out.println("Analyzing data...");
    }

    protected void composeReport() {
        System.out.println("Composing report content...");
    }

    protected void sendReport() {
        System.out.println("Sending report via email...");
    }

    // Hooks - optional extension points
    protected void beforeReport() { }
    protected void afterReport() { }
}
