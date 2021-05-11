package logic.corejava;

public class DuplicatesInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 3, 4, 5, 6, 6, 7 };

//		int len=a.length;
//		int temp[]=new int[len];
//		
//		int j=0;
//		
//		for(int i=0;i<len-1;i++) {
//			if(a[i]!=a[i+1]) {
//				temp[j++]=a[i];
//			}
//		}
//		
//		temp[j++]=a[len-1];
//		
//		for(int k=0;k<j;k++) {
//			System.out.println(temp[k]);
//		}

		// Without Temp Array
		int j = 0;
		if (a.length == 0 || a.length == 1) {

			System.out.println("Arrays is not applicable for removing duplicates...");
		}

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}
		a[j++] = a[a.length - 1];
		for (int k = 0; k < j; k++) {
			System.out.print(" " + a[k]);
		}

	}

}
