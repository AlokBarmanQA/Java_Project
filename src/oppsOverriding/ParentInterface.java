package oppsOverriding;

public class ParentInterface {

	public int parentNum=10;
	public String parentString="Parent String";
	
	public void commonMethod() {
		System.out.println("commonMethodParent");
	}
	
	public void parentMethod1() {
		System.out.println("parentMethod1");
	}
	
	public void parentMethod2() {
		System.out.println("parentMethod2");
	}
}
