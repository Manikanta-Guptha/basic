package logic.corejava;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {

		int a = 0, b = 1, k;

		System.out.println("Upto which number you want the Fibonocci Series..");
		int count = new Scanner(System.in).nextInt();
		/*
		 * Scanner sc=new Scanner(System.in); int count=sc.nextInt();
		 */

		System.out.print(a + " " + b + " ");

		for (int i = 2; i < count; i++) {
			k = a + b;// 1/2/3/5
			System.out.print(k + " ");// 1/2/3/5

			a = b;// 1/1/2
			b = k;// 1/2/3

		}

	}

}
