package interview2026;

import java.util.Arrays;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online
		// input : Java_123_Automation Output : Java Automation
		// Using split
		String str1 = "Java_123_Automation";
		String[] words1 = str1.split("_");
		String result1 = words1[0] + " " + words1[2];
		System.out.println("Using Split Method: " + result1);

		// Using Replace
		String str2 = "Java_123_Automation";
		String result2 = str2.replace("_123_", " ");
		System.out.println("Using Replace Method: " + result2);

		// Using backslash for special characters
		String str3 = "apple$$##10.5$$##10";
		String[] words3 = str3.split("\\$\\$##");
		System.out.println(Arrays.toString(words3));
		System.out.println(words3[0]);
		System.out.println(words3[1]);
		System.out.println(words3[2]);

		// Using replace and split together
		System.out.println("======Using replace and split together====");
		String str4 = "apple$$##10.5$$##10";
		String str4_1 = str4.replace("$$##", " ");
		String[] words4 = str4_1.split(" ");
		System.out.println(str4_1);
		System.out.println(Arrays.toString(words4));
		System.out.println(words4[0]);
		System.out.println(words4[1]);
		System.out.println(words4[2]);
	}

}
