package step1;
/*
 * # Up & Down 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */

import java.util.Random;
import java.util.Scanner;

public class Ex16_3Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int cnt = 0;
		int score = 0;
		int j = 1;
		
		int num = ran.nextInt(100) + 1;
		
		while(j == 1) {
			//강사님은 j 대신에 boolean run = true ;  후에
			//while(run == true) 설정 후 정답일때 run = false 로 바꿨음
			System.out.println("숫자를 맞추시오.");
			int ans = scan.nextInt();
			
			//다은이는 while문 내의 if문에 sysout을 넣을때가 있어요
			//그러면 입력은 한번만 받고 무한출력을 하지요
			//다회 입력을 받으려면 출력문을 while문 안에 if문 밖에 써용
		
			if(ans > num) {
				System.out.println("Down!");
				cnt ++;
			}else if(ans < num) {
				System.out.println("Up!");	
				cnt ++;
			}else if(ans == num) {
				System.out.println("정답입니다!");
				cnt ++; j = 0;
			}	
	}
		System.out.println(cnt + " 회만에 정답을 맞췄네요!");
		score = 100 - cnt * 5;
		System.out.println("점수는 " + score + " 입니다.");
	}
}
