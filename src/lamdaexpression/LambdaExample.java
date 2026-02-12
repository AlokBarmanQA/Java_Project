package lamdaexpression;

public class LambdaExample {
	
	public static void main(String[] args) {

		Greeting formalGreeting = (name) -> {
			System.out.println("Hello, " + name + "!");
		};
		formalGreeting.greet("Kumar");
		
		Greeting casualGreeting = name -> System.out.println("Hello, "+name+" !");
		casualGreeting.greet("Barman");
	}
}
