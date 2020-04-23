package polymorphism;

public class BPI {
	
	public double getHomeLoanROI() {
		
		return 8.5;
	}
	
	public double getCarLoanROI() {
		
		return 10.5;
	}
	
	public BPI getObject() {
		
		BPI obj = new BPI();
		return obj;
	}
	
	//WebDriver driver = new FirefoxDriver(); <- polymorphic reference
	
	public Number show() {
		
		return 10;
		
	}

}
