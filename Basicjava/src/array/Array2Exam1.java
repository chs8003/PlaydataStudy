package array;

public class Array2Exam1 {

    public static void main(String[] args) {
        char[][] input = new char[5][5];
        char currentChar = 'A';  // 시작 문자 'A'로 설정

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (j == i) {
                    System.out.print("*");  // 별 출력
                } else {
                    System.out.print(currentChar);  // 문자 출력
                }

                if (currentChar < 'Z') {
                    currentChar++;  // 다음 문자로 업데이트
                } else {
                    currentChar = 'A';  // 'Z' 이후에는 다시 'A'로 초기화
                }
            }
            
            System.out.println();  // 줄 바꿈
        }
}
}