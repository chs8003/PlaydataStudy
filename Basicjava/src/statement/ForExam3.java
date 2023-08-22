package statement;

public class ForExam3 {
	public static void main(String[] args) 	{
		int i,sum = 0,sum2 = 0,sum3 = 0;
		for(i=1; i<=100; i++) {
			 sum += i;
		 
			 if(i%2==0) {
				  sum2 +=i;
			 }
			 else {
				  sum3 +=i;
			 }
		}		
		 System.out.println("총합:"+ sum);
		 System.out.println("짝수합:"+ sum2);
		 System.out.println("홀수합:"+ sum3);
	}
}
