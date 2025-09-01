package reports;

public class WeeklyReport extends AbstractReport {

    @Override
    protected void fetchData() {
        System.out.println("Fetching weekly data from DB...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing weekly data...");
    }

    @Override
    protected void beforeReport() {
        System.out.println("Performing weekly pre-report checks...");
    }
}
