package overridding.test;

public abstract class TestAbstracClass implements TestInterface {

	private String abc;

	// Constructor for the abstract class
	public TestAbstracClass(String abc) {
		this.abc = abc;
	}

	// A concrete method shared by all wind instruments
	public void displayMaterial() {
		System.out.println(abc);
	}

	// Implementing one interface method with shared logic, leaving others abstract
	@Override
	public void method2() {// ***
		System.out.println("Override method method2");
	}

	// Abstract method that *must* be implemented by concrete subclasses
	public abstract void blowInto();// ***

}
