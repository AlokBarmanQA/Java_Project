package oppsOverriding;

public class TestingClass {

	public static void main(String[] args) {
		
		ParentClass parent = new ParentClass();
		parent.commonMethod();
		parent.parentMethod1();
		parent.parentMethod2();
		System.out.println(parent.parentNum);
		System.out.println(parent.parentString);
		System.out.println("===================================");
		
		ParentClass parentOverride = new ChildClass();
		parentOverride.commonMethod();
		System.out.println(parent.parentNum);
		System.out.println(parent.parentString);
//		System.out.println(parent.childNum);
//		System.out.println(parent.childString);
		System.out.println("===================================");
		
		ChildClass child = new ChildClass();
		child.commonMethod();
		child.childMethod1();
		child.childMethod2();
		System.out.println(child.childNum);
		System.out.println(child.childString);
	}
}
