package lamdaexpression;

public class ConcreteClassExample implements Greeting {

	@Override
	public void greet(String name) {

		System.out.println("Hello, " + name + "!");

	}

	public static void main(String[] args) {
		ConcreteClassExample concreteClassExample =new ConcreteClassExample();
		concreteClassExample.greet("Alok Barman");
	}
}
