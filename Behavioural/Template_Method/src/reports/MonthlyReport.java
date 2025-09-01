package reports;

public class MonthlyReport extends AbstractReport {

    @Override
    protected void fetchData() {
        System.out.println("Fetching monthly data from DB...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing monthly data...");
    }

    @Override
    protected void afterReport() {
        System.out.println("Archiving monthly report...");
    }
}
