import reports.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Daily Report ===");
        AbstractReport daily = new DailyReport();
        daily.generateReport();

        System.out.println("\n=== Weekly Report ===");
        AbstractReport weekly = new WeeklyReport();
        weekly.generateReport();

        System.out.println("\n=== Monthly Report ===");
        AbstractReport monthly = new MonthlyReport();
        monthly.generateReport();
    }
}
