package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;

public class extentReportManager {

    private static String reportFilePath = System.getProperty("user.dir") + "Report/NdosiAutomationReport.html";
    private static ExtentReports extent;
    private static ExtentSparkReporter sparkReporter;

    public static ExtentReports extentReports (){
        extent = new ExtentReports();
        sparkReporter = new ExtentSparkReporter(new File(reportFilePath));
        extent.attachReporter(sparkReporter);

        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setDocumentTitle("Ndosi Automation Report");
        sparkReporter.config().setReportName("Ndosi Automation Regression Report");

        extent.setSystemInfo("os", System.getProperty("os.name"));
        extent.setSystemInfo("user", System.getProperty("user.name"));

        return extent;
    }

}
