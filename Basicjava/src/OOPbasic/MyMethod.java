package OOPbasic;

import java.util.Scanner;
//미니계산기 - if문
public class MyMethod {
	public int add(int opr, int num1, int num2) {
	
        int result = 0;
        if(opr==1) {
        	result = num1+num2;
        }else if(opr==2) {
        	result = num1-num2;
        }else if(opr==3) {
        	result = num1*num2;
        }else if(opr==4) {
        	result = num1/num2;
        }
        System.out.println("계산결과=>"+result);
		return result;
        
	}
}
