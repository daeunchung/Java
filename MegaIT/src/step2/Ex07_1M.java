// 2020-02-20 12:29-13:15 결국못해서 보고했음
package step2;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1단계] : 1 to 4
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
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
public class Ex07_1M {

	public static void main(String[] args) {
		int[] arr = new int[4];
		int[] check = new int[4];
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		while(i < 4) {
			
			int idx = ran.nextInt(4); //0 1 2 3 
			
			if(check[idx] == 0) {
				check[idx] = 1;
				arr[i] = idx + 1;
				i++;
			}

		}
		
		int cnt = 0;
//		boolean run = true;
//		while(run) {
			

			
		while(true) {
			
			for(int j = 0; j < 4; j ++) {
				System.out.print(arr[j] + " ");
			}System.out.println();
			
			if(cnt == 4) {
				System.out.println("게임 종료");
				break;
				//run = false;
			}
			 
			System.out.print("입력 : ");
			int num = scan.nextInt();
			
			if(arr[num] == cnt + 1) {
				arr[num] = 9 ;
				cnt++;
				//k++;
			
			}
//			if(arr[num] != cnt + 1) {
//				break;
//			}
		}
//		}
	}
}

/*
 * break; 바로 중단 while문 밖으로 나와버림
 * continue; 바로 중단 continue 아래에 있는것들 실행 X , while문 조건이 시작하는 부분으로 다시간다 -> while밖으로 나가는게 아님
 * 
 */

