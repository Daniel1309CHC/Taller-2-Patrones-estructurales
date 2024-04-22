package decorator;

public class FinancialReport implements IReport{

	private String content; 
	
	public FinancialReport(String content) {
		this.content = content;
	}
	
	@Override
	public void generate() {
		System.out.println("Generando informe: " + content);
	}
}
