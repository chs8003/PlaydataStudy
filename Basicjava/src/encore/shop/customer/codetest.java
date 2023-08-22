package encore.shop.customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codetest {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");  
    int n = Integer.parseInt(input[0]);
    int m = Integer.parseInt(input[0]);
     
    int[] array = new int[n];
    
 
    for(int i=1; i<n; i++) {
    	array[i] = i;
    }
    
    for(int j=0; j<m; j++) {
    	int a = Integer.parseInt(input[j]);
    	int b = Integer.parseInt(input[j]);
    	int input2 = array[a];
    	array[a] = array[b];
    	array[b] = input2;
    }
	
   for(int i=1; i<n; i++) {
	   System.out.println(array[i]+"");
   }
	}	
}
