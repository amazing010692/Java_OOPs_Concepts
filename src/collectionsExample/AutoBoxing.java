package collectionsExample;

public class AutoBoxing {

	public static void main(String[] args) {
		
		int var = 10;
		@SuppressWarnings("deprecation")
		Integer obj = new Integer(var);		//wrapping --> Autoboxing
		
		System.out.println(obj);
		
		int i = obj;	//unwrapping -- > Unboxing

	}

}
