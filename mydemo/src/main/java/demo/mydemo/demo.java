package demo.mydemo;

public class demo implements TestTwo{

	public void add() {
		System.out.println(99);
		
	}

	public void mul() {
	    System.out.println(999);
		
	}
	public static void main(String[] args) {
		
		demo obj = new demo();
		obj.add();
		obj.mul();
	}

	
}
