package step2;
/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */

import java.util.Random;

public class Ex02_1Q {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];
		int sum = 0;
		int cnt = 0;
		
		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		for(int i = 0; i < 5; i++ ) {
			arr[i] = ran.nextInt(100) + 1;
			
			if(arr[i] >= 60)
				cnt ++;
			
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		System.out.println("총점은 " + sum);
		
		double avg = sum / 10.0;
		System.out.println("평균은 " + avg);

		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		System.out.println("합격생 수는 " + cnt + "명");
	}

}
