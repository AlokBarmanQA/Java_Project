package hacker.rank.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operators {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double meal_cost = Double.parseDouble(br.readLine().trim());
		int tip_percent = Integer.parseInt(br.readLine().trim());
		int tax_percent = Integer.parseInt(br.readLine().trim());
		double total_cost = meal_cost + (meal_cost*tip_percent/100.0) + (meal_cost * tax_percent/100.0);
		System.out.println(Math.round(total_cost));

	}

}
