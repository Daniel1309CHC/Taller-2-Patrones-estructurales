package decorator;

public class Main {
	public static void main(String[] args) {
		IReport report1 = new FinancialReport("Reporte financiero");
		IReport reportPDF = new ReportPDF(report1);
		reportPDF.generate();
		
		IReport report2 = new FinancialReport("Reporte financiero");
		IReport reportPDF2 = new ReportPDF(report2);
		IReport reportPDFAndExcel = new ReportExcel(reportPDF2);
		
		reportPDFAndExcel.generate();
	}
}
