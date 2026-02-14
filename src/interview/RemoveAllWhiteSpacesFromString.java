package interview;

public class RemoveAllWhiteSpacesFromString {

	public static void main(String[] args) {
		String name = " Alok Kumar Barman ";
		name = name.trim();
		System.out.println(">>>"+name+"<<<");
		name = name.replace(" ", "");
		System.out.println(">>>"+name+"<<<");
	}

}
