package logic.corejava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int flag = 0;

		int num = new Scanner(System.in).nextInt();

		if (num == 0 || num == 1) {
			System.out.println("Given number is not a prime number");
		} else {

			for (int i = 2; i <= num / 2; i++) {

				if (num % 2 == 0) {
					flag = 1;
					System.out.println("Given number is not a prime number..");
					break;
				}

			}
			if (flag == 0) {
				System.out.println("Given number is a prime number..");
			}

		}
	}

}
