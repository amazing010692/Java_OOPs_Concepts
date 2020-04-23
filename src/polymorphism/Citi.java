package polymorphism;

public class Citi extends BPI {
	
	public static void main(String[] args) {
		
		Citi obj = new Citi();
		System.out.println(obj.getHomeLoanROI());
		
		BPI obj2 = new Citi();
		
	}
	
	public double getHomeLoanROI() {
		
		return 10.5;
	}
	
	public Integer show() {
		
		return 10;
		
	}

}