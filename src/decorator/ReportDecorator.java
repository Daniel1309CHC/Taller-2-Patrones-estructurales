package decorator;

public abstract class ReportDecorator implements IReport{
	protected IReport decoratedReport;
	
	public ReportDecorator(IReport decoratedReport) {
		this.decoratedReport = decoratedReport;
	}
	
	@Override
	public void generate() {
		decoratedReport.generate();
	}
}
