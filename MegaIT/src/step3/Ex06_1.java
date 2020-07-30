package step3;
/*
 * # 정렬하기
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */

public class Ex06_1 {

	public static void main(String[] args) {
		int[] score = {10, 50, 30, 40, 80, 7};

		for(int i = 0; i<6; i++) {
			int maxNum = score[i];
			int maxIdx = i; // i가 돌면서 무조건 점수랑 인덱스를 맥스로 지정
			for(int j = i; j<6; j++) { // j 가 i부터 5까지 돌기때문에 앞에 이미 정렬된 놈들은 건들지 않는 구조
				if(maxNum < score[j]) { // 그 뒷놈들 중에 현재 최댓값보다 큰놈들 있으면 갱신
					maxNum = score[j];
					maxIdx = j;
				}
			}
			
			int temp = score[i];
			score[i] = score[maxIdx];
			score[maxIdx] = temp;
			// score[i]와 score[maxIdx] 의 값을 교환해주는 과정
		}
		
		for(int i = 0; i<6; i++) {
			System.out.print(score[i] + " ");
		}System.out.println();
		
		
	}

}