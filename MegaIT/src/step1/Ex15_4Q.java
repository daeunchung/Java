package step1;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 */
public class Ex15_4Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("구구단 게임을 5회 반복합니다");
		int cnt = 0;
		int i = 1;
		
		while(i <= 5) {
		int ans = 0;
		int num1 = ran.nextInt(9) + 1;
		int num2 = ran.nextInt(9) + 1;
		ans = num1 * num2;
		
		System.out.println(num1 + " * " + num2 + " = ?");
		int myAns = scan.nextInt();
		
		if(ans == myAns) {
			cnt += 1;
		}
		i++;	
	}
		
		System.out.println(cnt + "회 정답을 맞췄네요!");
		System.out.println("성적은 " + cnt*20 + "점 입니다");	
}

}
