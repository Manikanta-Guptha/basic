package basic.corejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColleDemo {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map= new HashMap<>();
		Collection<Integer> list = new ArrayList<>();
		
		list.add(15);
		list.add(14);
		list.remove(12);
		
		
		for (Integer i :list) {
			System.out.println(i);
		}

	}

}
