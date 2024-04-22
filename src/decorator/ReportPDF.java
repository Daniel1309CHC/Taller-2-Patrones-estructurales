package decorator;

public class ReportPDF extends ReportDecorator{
	public ReportPDF(IReport decorateReport) {
		super(decorateReport);
	}
	
	@Override
	public void generate() {
		super.generate();
		pdfReport();
	}
	
	private void pdfReport() {
		System.out.println("Reporte generado en PDF");
	}
}
