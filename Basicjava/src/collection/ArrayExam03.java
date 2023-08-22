package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayExam03 {

	public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
    
        List<String> student1 = new ArrayList<>();  
        student1.add("1");
        student1.add("장동건");
        student1.add("50");
        student1.add("80");
        student1.add("100");
        list.add(student1);

        List<String> student2 = new ArrayList<>(); 
        student2.add("2");
        student2.add("이민홓");
        student2.add("60");
        student2.add("70");
        student2.add("100");
        list.add(student2);
   
        List<String> student3 = new ArrayList<>();  
        student3.add("3");
        student3.add("김우빈");
        student3.add("70");
        student3.add("85");
        student3.add("95");
        list.add(student3);
        
        display(list);
    }

    public static void display(List<List<String>> data) {
        for (List<String> student : data) {
            for (String data2 : student) {
                System.out.print(data2 + " ");
            }
            System.out.println();
        }
    }
}