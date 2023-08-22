package array;

public class ArrayCopyTest {
	  public static void main(String[] args) {
	int[] firstArr=  new int[5];
	
	for(int i=0; i<firstArr.length; i++) {
		firstArr[i]= 10+i;
	}
	for(int j=0; j<firstArr.length; j++) {
		System.out.print(firstArr[j]+"");
	} 
	
	int secondArr[] =new int[firstArr.length *3];
	
	System.arraycopy(firstArr, 0, secondArr, 0, firstArr.length);
	for(int i=0; i<secondArr.length; i++) {
		System.out.print(secondArr[i]+" ");
	}
	  }
}
