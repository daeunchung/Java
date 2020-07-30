package step1;

public class Ex15_1 {

	public static void main(String[] args) {
		/*
		 * # 반복문 while
		 * 1. 반복문의 조건 3가지
		 * 1) 초기식
		 * 2) 조건식
		 * 3) 증감식
		 * 
		 * 2. 구조
		 * 초기식;
		 * while(조건식){
		 * 		조건식이 참일 동안 실행할 문장;
		 * 		증감식;
		 * }
		 */
		
		// 예) 1~5까지 출력
		
		int i = 1;						// 초기식
		while(i <= 5) {					// 조건식
			System.out.println(i);
			i = i + 1;					// 증감식		i += 1;
		}
	}
}
