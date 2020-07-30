package step2;

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */
public class Ex02_3Q {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.print("학번 입력 : " );
		int sNum = scan.nextInt();
		
		if( 1001 <= sNum && sNum <= 1005) {
			for(int i = 0; i < 5; i++) {
				
				if(sNum == hakbuns[i]) {
					System.out.println("성적 : " + scores[i]);
				}
			}
		}else
			System.out.println("해당학번은 존재하지 않습니다.");
	}	

}
/*
 * 강사님 코드 굉장히 좋은 간결한 코드인듯 !!
 * 
 * 강사님 코드는 int check 변수를 선언하여    없는 학번을 입력시에  check = -1 로
 * 있는 학번 입력시에   check = 학번의 인덱스 값 으로 설정하여
 * if check == -1 -> 학번 존재안한다,  else score[check] 출력
 */


