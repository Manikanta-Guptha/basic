package logic.corejava;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		String reverse = "";

		System.out.println("Enter the String...");
		String input = new Scanner(System.in).next();

		if (input == null || input.isEmpty()) {
			System.out.println("String must not be empty..");
		}

		for (int i = input.length() - 1; i >= 0; i--) {

			reverse = reverse + input.charAt(i);
		}
		if (reverse.equalsIgnoreCase(input)) {
			System.out.println("Pallindrome...");
		} else {
			System.out.println("Not Pallindrome..");
		}
	}

}
