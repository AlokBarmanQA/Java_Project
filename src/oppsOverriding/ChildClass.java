package oppsOverriding;

public class ChildClass extends ParentClass {
	
	public int childNum=20;
	public String childString="Child String";
	
	//@Override
	public void commonMethod() {
		System.out.println("commonMethodChild");
	}
	
	public void childMethod1() {
		System.out.println("childMethod1");
	}
	
	public void childMethod2() {
		System.out.println("childMethod2");
	}
}
