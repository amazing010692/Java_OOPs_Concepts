package interfaceexamples;

public class Child1 extends ParentClass1 implements Parent1, Parent2 {

	/*@Override
	public void show() {
		
		System.out.println("Child show()");
		
	}*/
	
	public static void main(String[] args) {
		
		Parent2 c = new Child1();
		c.show();
	}

}
