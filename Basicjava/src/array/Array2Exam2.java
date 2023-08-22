package array;

public class Array2Exam2 {

    public static void main(String[] args) {
    	int[][] input = {{90,80,100},{70,90,80}};

    	int sum=0;
    	int avg =0;
    	for(int i=0; i<2; i++) {
    		for(int j=0; j<3; j++) {
    			System.out.print(input[i][j]+" ");
    			sum += input[i][j];	
    			avg = sum/input[i].length;
    		}
    		System.out.print("합계" + sum+" ");
    		System.out.println("평균"+avg+" ");
    	}
    	

}
}