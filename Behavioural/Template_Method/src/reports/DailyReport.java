package reports;

public class DailyReport extends AbstractReport {

    @Override
    protected void fetchData() {
        System.out.println("Fetching daily data from DB...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing daily data...");
    }
}
