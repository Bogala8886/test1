package hi;

class C {
	int i = 10;

	void m2() {
		System.out.println("This is m2 method");
	}
}

public class AcessModifiersDemo {

	/*
	 * protected int i=10;
	 * 
	 * protected void m1() { System.out.println("This is m1 method"); }
	 */

	public static void main(String[] args) { // TODO Auto-generated method stub

		C d = new C();
		System.out.println(d.i);
		d.m2();

	}

}
