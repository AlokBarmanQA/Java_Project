package overridding.test;

public class TestClassDemo extends TestAbstracClass {

	public TestClassDemo(String abc) {
		super(abc);
		// TODO Auto-generated constructor stub
	}

	 // Implementation of the required interface method//***
	 @Override
	 public void method1() {//***
	     System.out.println("method1");
	 }

	 // Implementation of the required abstract method from the abstract class
	 @Override
	 public void method2() {//***
	     System.out.println("method2");
	 }

	 @Override
	 public void blowInto() {
		// TODO Auto-generated method stub
		
	 }

}
