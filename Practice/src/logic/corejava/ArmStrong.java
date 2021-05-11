package logic.corejava;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {

		int rev = 0;

		System.out.println("Enter number...");
		int input = new Scanner(System.in).nextInt();

		int temp = input;
		while (input != 0) {

			int sin = input % 10;
			rev = rev + (sin * sin * sin);
			input = input / 10;

		}
		if (rev == temp) {
			System.out.println("ArmStrong");
		} else {
			System.out.println("Not an ArmStrong..");
		}

	}

}
