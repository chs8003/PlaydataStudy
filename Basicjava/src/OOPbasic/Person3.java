package OOPbasic;

import java.util.ArrayList;

public class Person3 {
	String name;
	int age;
	boolean state;
	int [] arr;
	ArrayList<Integer> list;
	
	
	public Person3(String name, int age, boolean state, int[] arr, ArrayList<Integer> list) {
		super();
		this.name = name;
		this.age = age;
		this.state = state;
		this.arr = arr;
		this.list = list;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isState() {
		return state;
	}


	public void setState(boolean state) {
		this.state = state;
	}


	public int[] getArr() {
		return arr;
	}


	public void setArr(int[] arr) {
		this.arr = arr;
	}


	public ArrayList<Integer> getList() {
		return list;
	}


	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}
}
