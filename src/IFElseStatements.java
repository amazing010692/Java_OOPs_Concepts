public class IFElseStatements {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 20);
		System.out.println(num);
		
		if(num > 10) {
			System.out.println(num + " is Greater than 10");		
		}
		
		else if(num <= 10 && num >= 5) {
			System.out.println(num + " is between 5 and 10");
		}
		
		else {
			System.out.println(num + " is Less than 10");	
		}

	}

}
