package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            createInstance();
        }
        return extent;

    }

    private static void createInstance() {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester", "Sumit Kharya");
    }
}
