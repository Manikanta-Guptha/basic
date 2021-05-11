package basic.corejava;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		int arr[] = new int[4];
		//int arr[] = { 1, 3, 2, 4 };--> We can give like this also

		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 2;
		arr[3] = 4;
		
		Arrays.sort(arr);//sorting itself

		//System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for(int i:arr) {
			System.out.println(i);
		}
	}

}
