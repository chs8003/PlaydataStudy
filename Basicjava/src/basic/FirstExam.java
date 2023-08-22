package basic;

public class FirstExam {
	public static void main(String[] args) 	{
	//변수 선언
	int math = 85;
	int korean = 90;
	int english = 100;
	
	int total = math+korean+english;
	int average = (total / 3);
	System.out.println("총점:" + total);
	System.out.println("평균:" + average);

	//배열 이용276
	int sum = 0;
	int avg = 0;
	int score[] = {85,90,100};
	for(int i=0; i<score.length; i++) {
	    sum += score[i];
	}
	   avg = sum / score.length;
	   
	  System.out.println("총점:"+ sum);
	  System.out.println("평균:"+ avg);
}
}