package basic.corejava;

public class TwoDimenArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 2, 3, 4, 5 };
		int c[] = { 3, 4, 5, 6 };

		int d[][] = { a, b, c};

		for (int i = 0; i < d.length; i++) {//this loop for rows
			for (int j = 0; j < a.length; j++) {//this loop for columns
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}
	}

}
