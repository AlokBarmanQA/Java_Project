package dailypractice;

import java.util.Arrays;

public class HackerTest {
	String[] words;
	String name;
	double price;
	int quantity;
	
	public HackerTest(String str) {
		words = str.split("$$##");
		name = words[0];
		price = Double.parseDouble(words[1]);
		quantity = Integer.parseInt(words[2]);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public static void main(String[] args) {
		String str="apple$$##10.5$$##10";
		String[] wordsDosesNotWork = str.split("$$##");//Doesnot work
		System.out.println(Arrays.toString(wordsDosesNotWork));
		String update = str.replace("$$##", " ");
		System.out.println(update);
		String[] words = update.split(" ");
		System.out.println(Arrays.toString(words));
	}
}
