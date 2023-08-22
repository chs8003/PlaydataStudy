package collection;

import java.util.ArrayList;
import java.util.List;

//배열을 ar
public class ArrayExam02 {
	//changeArraylist
	
	public static void main(String[] args) {
		String[] strArr = {"java", "servlet", "jsp", "spring"};
        ArrayList<String> list = changeArrayList(strArr);
        for (String str : list) {
            System.out.println(str);
        }
    }
	
	public static ArrayList<String> changeArrayList(String[] strArr) {
		ArrayList<String> list = new ArrayList<String>();
		for (String data : strArr) {
		    list.add(data);
		}
		return list;
	}

}
