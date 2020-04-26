package constructors;

public class Students {
	
	public Students() {
		
		System.out.println("Calling constructor");
	}
	
	public Students(int i) {
		
		System.out.println(i);
	}
	
	String studentName;
	int rollNum;
	
	public Students(String studentName, int rollNum) {
		this(10); //constructor chaining
		this.studentName = studentName;
		this.rollNum = rollNum;
	}

	public static void main(String[] args) {
		
		Students st = new Students("Janielle", 10692);
		System.out.println(st.studentName);
		System.out.println(st.rollNum);
		/*//Test t = new Test();
		new Students();
		new Students("Janielle", 10692);
		System.out.println(st.studentName);
		System.out.println(st.rollNum);*/

	}

}
