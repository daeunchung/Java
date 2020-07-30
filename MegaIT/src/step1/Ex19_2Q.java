package step1;

import java.util.Random;
import java.util.Scanner;

/*
 * # 랜덤학생
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 */
public class Ex19_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int i = 0;
		int total = 0;
		int pass = 0;
		int max = 0;
		int best = 0;
		
		while(i < 10) {
		int score = ran.nextInt(101) + 1;
		total += score ;
		
			if(score >= 60) {
				pass ++;
			}
			
			if(score > max) {
				max = score;
				best = i + 1;
			}
		
		i++;
		}
		System.out.println("전교생(10명)의 총점 : " + total + "점");
		System.out.println("전교생(10명)의 평균 : " + total / 10.00 + "점");
		System.out.println("합격자 수 : " + pass + "명");
		System.out.println("1등 학생의 번호와 성적 : " + best + "번 학생(" + max+ "점)");
	}
}
