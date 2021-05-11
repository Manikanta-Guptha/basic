package basic.corejava;

public class TypeCasting {

	public static void main(String[] args) {
		
		int i=5;
		double d=i;//widening
		System.out.println(i+"--"+d);
		
		float f=5;
		int c=(int)f;//Narrowing
		
		System.out.println(f+"--"+c);
	
	}

}
