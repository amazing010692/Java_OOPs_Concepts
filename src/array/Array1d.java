package array;

public class Array1d {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		String[] myArray = new String[13];
		
		
		for(int index = 0; index < array.length; index++) {
			
			array[index] = (int)(Math.random() * 1000);
			
			//System.out.println(array[index]);
		}
		
		for( int var:array) {
			System.out.println(var);
		}
		
		System.out.println("---Printing in Reverse order---");
		
		for(int index = array.length - 1; index >= 0; index--) {
			
			System.out.println(array[index]);
			
		}
		
		int[] array1 = {1, 2, 3, 4, 5};
		System.out.println("H A R D C O D I N G");
		System.out.println(array1.length);

	}

}
