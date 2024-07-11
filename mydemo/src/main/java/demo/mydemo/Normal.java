package demo.mydemo;

//** single normal can can implements multiple interfaces , multiple inheritance 


public class Normal implements TestOne,TestTwo {

	public void mul() {
		System.out.println(3*3);
	}

	public void add() {
		System.out.println(3+3);
		
	}
	public static void main(String[] args) {
		Normal obj = new Normal();
		obj.mul();
		obj.add();
	}

}
