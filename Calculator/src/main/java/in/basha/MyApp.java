package in.basha;

public class MyApp {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		Integer res = c.add(20, 7);
		Integer multiply = c.multiply(2, 3);
		System.out.println(res);
		System.out.println(multiply);
	}
}
