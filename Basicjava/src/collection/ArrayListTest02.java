package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest02 {
	public static void main(String[] avgs) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("oracle");
		list.add("html");
		list.add("css");
		list.add("javaScript");
		display(list);
		list.set(4, "Java and query");
		display(list);
						
	}

	private static void display(List<String> list) {
		for(String data:list) {
			System.out.println(data);
		}
		
	}
}
