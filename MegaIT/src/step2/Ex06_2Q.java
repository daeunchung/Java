
package step2;
/*
 * # 기억력 게임
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 0
 * 입력2 : 1
 * 
 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
 */

import java.util.Random;
import java.util.Scanner;

public class Ex06_2Q {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		// 셔플(shuffle)
		int i = 0;
		while(i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			i += 1;
		}
		
		while(true) {
			
		for(int j=0; j<10; j++) {
			System.out.print(front[j] + " ");
		}
		System.out.println();
		
		for(int j=0; j<10; j++) {
			System.out.print(back[j] + " ");
		}System.out.println();
		
		System.out.print("입력1 : ");
		int i1 = scan.nextInt();
		System.out.print("입력2 : ");		
		int i2 = scan.nextInt();

		if(front[i1] == front[i2]) {
			
			back[i1] = front[i1];
			back[i2] = front[i2];
		}
	}
}

}
