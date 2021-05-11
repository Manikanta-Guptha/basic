package logic.corejava;

import java.util.Scanner;

public class NumberPallindrome {

	public static void main(String[] args) {

		int reverse = 0;

		System.out.println("Enter the number..");

		int input = new Scanner(System.in).nextInt();
		int actual=input;

		while (input != 0) {

			int remainder = input % 10;
			reverse = reverse * 10 + remainder;
			input = input / 10;
		}
		if (actual == reverse) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not a Pallindrome..");
		}

	}

}
