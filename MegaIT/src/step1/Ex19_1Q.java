package step1;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 */
public class Ex19_1Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		int cnt = 1;
		
		while(cnt <= 3) {
			System.out.print("정수를 입력하시오   ");
			int num = scan.nextInt();
			
			if(cnt == 1) 
				max = num;
			// 강사님 코드는 내꺼 위에 두줄 부분 없음.. 무조건 양수만 받는다고 생각하고 짜신건가..
			//  maxNum 을 0으로 지정해놓으셨던데..
			else {
				if(num >= max) {
					max = num;
				}
			}
			cnt ++;
		}
		System.out.println("세 숫자 중 가장 큰 값은 " + max);
	}

}
