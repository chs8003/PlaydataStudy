package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 1부터 50까지 랜던수를 6개 발생시켜서 arraylist에 저장하고 출력형식대로 출력
//출력형식은 랜덤수가:5,7,9,13,40 이면 5(홀수), 7(짝수)
public class ArrayListExam01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();{
			Random r = new Random();
			int input = 0;
			for(int j=0; j<5; j++) {
				input = r.nextInt(50)+1;
				list.add(input);
			}
			
			for(int data:list) {
				if(data%2==0) {
				System.out.print(data+"짝수");
			}
			else {
				System.out.print(data + "홀수");
			}
			}
		}
	}

}
