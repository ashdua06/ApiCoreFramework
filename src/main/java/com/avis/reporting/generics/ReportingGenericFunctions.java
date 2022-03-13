package com.avis.reporting.generics;

import com.avis.reporting.extentReports.ExtentManager;
import com.avis.reporting.perfStatusReport.CreateAPIPerfReport;
import org.openqa.selenium.WebDriver;

public class ReportingGenericFunctions {
    public static void initExtentReporter(boolean removeRetriedTests, boolean addScreenshotsToReport, String reportName, String reportTitle) {
        ExtentManager.createInstance(reportTitle, removeRetriedTests, addScreenshotsToReport, reportName);

    }

    public static void initAPIPerfReporter(String apiPerfReportFileName, String apiPerfReportTitle){
        CreateAPIPerfReport.setApiPerfReport(true);
        CreateAPIPerfReport.createHTMLReport(apiPerfReportFileName,apiPerfReportTitle);
    }
}
