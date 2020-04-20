
public class DataTypes {
	
	public static void main (String[] args) {
		
		// Sample code below are examples of Primitive types
		
		int i = 123456789;	// int --> integer
		float f = 1.234f;	// stores decimal, add letter "f"
		long l = 1234567890134343l;	// stores long values, add letter "l"
		double d = 1.232323348284454876484788; 	// acts like float, but stores longer values, no need to add letter.
		boolean b = true;	// stores value like true or false
		char c = 'a';		// only stores single character
		String s = "This is a Java tutorial";	// for more than 1 characters,  Class in Java
		
		// This is a Non-Primitive type
		DataTypes dt;
		
		String xyz = "jjshdhsdhwuhduwhd";
		
		int batmanBegins;
		int theDarkKnight;
		int theDarkKnightRises;
		
		String abc = new String();	// simply creates an object of the String class.
		abc = "Hello";
		
		String abc1 = "Hello";	// the object is being created and "Hello" is stored in 'abc1' variable.
		
		String s1 = "Way";
		String s2 = "2";
		String s3 = "Automation";
		String s4 = s1 + s2 + s3;
		
		// String + String ---> Concatenated string
		System.out.println(s4);
		System.out.println(s1 + s2 + s3);
		System.out.println("Way" + "2" + "Automation");
		System.out.println("Way2Automation");
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1 + num2 + "after");
		System.out.println("before" + num1 + num2 + "after");
		System.out.println("before" + (num1 + num2) + "after");
		System.out.println(!false);
		System.out.println(34 == 78);
		System.out.println(78 == 78);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println((123 == 124) && (10 == 10));
		System.out.println((123 == 123) && (10 == 10));
		
			
		
		
		/*
		 * 12 + 45 // "12" and "45" are operands | "+" is the operator
		 * 
		 * Unary Operator --> Accepts 1 or single operand
		 * Binary Operator --> Accepts 2 operands
		 * Ternary Operator --> Accepts 3 operands
		 */
	}

}
