package org.studyeasy;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//class Names {
//	
//	private String name;
//	
//	public Names(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		return name;
//	}
//
//}

class Data<T> {
	
	private T myVariable;
	
	public Data(T myVariable) {
		super();
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}
	
}

public class App {

	public static void main(String[] args) {
		
		// Change from using custom class to generic class
		
//		List<Object> elements = new LinkedList<>();
//		elements.add(new Names("Chaand"));
//		elements.add(new Names("Ed"));
//		elements.add(new Names("John"));
//		elements.add(new Names("Mia"));
//		elements.add("Some String");
//		elements.add(1);
//		elements.add(2.0);
//		elements.add("#");
//		List<Data<Object>> elements = new LinkedList<>();
//		List<Data<String>> elements = new LinkedList<>(); // Applied restrictions (String)
		List<Data<Integer>> elements = new LinkedList<>(); // Applied restrictions (Integer)
		elements.add(new Data<Integer>(1));
		elements.add(new Data<Integer>(2));
		elements.add(new Data<Integer>(3));
		elements.add(new Data<Integer>(4));
		elements.add(new Data<Integer>(5));
//		elements.add(new Data<String>("Some text"));
//		elements.add(new Data<String>("One"));
//		elements.add(new Data<String>("Two"));
//		elements.add(new Data<String>("Three"));
//		elements.add(new Data<String>("Four"));
//		elements.add(new Data<Object>("Some text"));
//		elements.add(new Data<Object>(1.0));
//		elements.add(new Data<Object>(1));
//		elements.add(new Data<Object>('%'));
//		elements.add(new Data<Object>(5.0f));
		
		
		App app = new App();
		app.iteratorPrintList(elements);

	}
	
	void iteratorPrintList(List<Data<Integer>> list) {
		ListIterator<Data<Integer>> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element: " + iterator.next().getMyVariable() * 10);
		}
	}
//	void iteratorPrintList(List<Data<String>> list) {
//		ListIterator<Data<String>> iterator = list.listIterator();
//		while(iterator.hasNext()) {
//			System.out.println("Element: " + iterator.next().getMyVariable());
//		}
//	}
//	void iteratorPrintList(List<Data<Object>> list) {
//		ListIterator<Data<Object>> iterator = list.listIterator();
//		while(iterator.hasNext()) {
//			System.out.println("Element: " + iterator.next().getMyVariable());
//		}
//	}

}
