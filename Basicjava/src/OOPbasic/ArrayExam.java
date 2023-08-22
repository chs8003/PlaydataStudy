package OOPbasic;
public class ArrayExam {
	public void array(int array[]) {
		int oddHap = 0;
		int evenHap = 0;
		//배열의 합을 구해서 출력 
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0){
				evenHap = evenHap + array[i];
			}else{
				oddHap = oddHap + array[i];
			}
		}
		
		System.out.println("홀수의합:"+oddHap);
		System.out.println("짝수의합:"+evenHap);
	}
}


















