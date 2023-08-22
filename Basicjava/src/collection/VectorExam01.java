package collection;

import java.util.Vector;

public class VectorExam01 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(70);
		v.add(80);
		v.add(90);
		v.add(100);
		v.add(75);
		System.out.println(v);
		int sum =0;
		double avg=0.0;
		
		for(int data1:v) {
			sum += data1;
		}
		avg = sum / v.size();
		System.out.println(sum);
		System.out.println(avg);
	}

}
