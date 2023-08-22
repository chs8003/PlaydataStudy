package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeTest {
	public static void main(String[] args) 	{
	int a = 8800;
	int hour = 8800/3600;
	int minute = (8800%3600)/60;
	int second = 8800%60;
	System.out.println(hour+"시간" + minute+"분" + second+"초");
	
	}
	
}
