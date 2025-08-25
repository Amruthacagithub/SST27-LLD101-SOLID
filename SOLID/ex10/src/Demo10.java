import Logger.ConsoleLogger;
import Logger.Logger;

public class Demo10 {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        ReportService serviceReport = new ReportService(logger);
        serviceReport.generate();
    }
}
