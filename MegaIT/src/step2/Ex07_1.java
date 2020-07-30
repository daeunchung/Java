package step2;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1단계] : 1 to 4
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 *  // Ex04_2 중복숫자 금지 1단계 문제 기억나니 -> 코드를 왜 외워야하는지 알겠지?
 * 
 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 * 예)
 * 4 2 3 1
 * 입력 : 3
 * 4 2 3 9
 * 입력 : 1
 * 4 9 3 9
 * ...
 */

public class Ex07_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] check = new int[4]; // int[] check = {0, 0, 0, 0};
		int[] arr = new int[4]; // int[] arr = {0, 0, 0, 0};
		
		for(int i = 0; i<4; i++) {
			int idx = ran.nextInt(4);
			if(check[idx] == 0) {
				check[idx] = 1;
				arr[i] = idx + 1;
				}else
					i--;
		}
		
		boolean run = true;
		int cnt = 0;
		
		while(run) {
			
		for(int j = 0; j < 4; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		System.out.print("입력 : ");
		int num = scan.nextInt();
		cnt++;
		if(arr[num] == cnt) {
			arr[num] = 9;
		}else
			cnt--;
		
		if(arr[0]==9 && arr[1]==9 && arr[2]==9 && arr[3]==9) {
			run = false;
			System.out.println("게임 종료");
		}
		}
		
		//중복없이 랜덤입력받기 SO IMPORTANT 통으로 외워 //
		/*int i =0;
		while(i < 4) {
			int idx = ran.nextInt();
			if(check[idx] == 0) {
				check[idx] = 1;
				arr[i] = idx + 1;
				i++;
			}
		}*/
	}
}
