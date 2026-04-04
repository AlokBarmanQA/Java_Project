package dailypractice;

public class HackerTestMain {

	public static void main(String[] args) {
		String str="apple$$##10.5$$##10";
		HackerTest obj = new HackerTest(str);
		System.out.println(obj.getName());
		System.out.println(obj.getPrice());
		System.out.println(obj.getQuantity());
	}

}
