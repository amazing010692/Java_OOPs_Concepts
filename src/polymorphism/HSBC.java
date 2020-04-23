package polymorphism;

public class HSBC extends BPI {
	
	public static void main(String[] args) {
		
		HSBC obj = new HSBC();
		System.out.println(obj.getHomeLoanROI());
		
	}
	
	public double getHomeLoanROI() {
		
		return 10.25;
	}
	
	public AMEX getObject() {
		
		AMEX obj = new AMEX();
		return obj;
	}

}
