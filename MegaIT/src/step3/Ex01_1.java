package step3;
//1시 43분 - 54분
/*
 * # 최대값 구하기[3단계]
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 
 * 11, 0, 42, 0, 24
 */

import java.util.Scanner;

public class Ex01_1 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		
		
		
		boolean run = true;
		int cnt = 0;
		while(run) {
			
			for(int i = 0; i < 5 ; i++) {
			System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.print("입력 : ");
			int num = scan.nextInt();
			System.out.println();
			
			
			int MaxNum = 0;
			int MaxIdx = 0;
			
			for(int i = 0; i < 5 ; i++) {
				if(MaxNum < arr[i]) {
					MaxNum = arr[i];
					MaxIdx = i;
				}
			}
				if(num == MaxNum) {
					arr[MaxIdx] = 0;
					cnt++;
				}
				if(cnt == 5) {
					System.out.println("모든 원소가 0이므로 종료");
					run = false;
				}
				
			

		}
		
	}
		
}


