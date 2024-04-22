package decorator;

public class ReportExcel extends ReportDecorator{
	
	public ReportExcel(IReport decorateReport) {
		super(decorateReport);
	}
	
	@Override
	public void generate() {
		super.generate();
		excelReport();
	}
	
	private void excelReport() {
		System.out.println("Reporte generado en Excel");
	}
}
