package step3;

import java.util.Scanner;

/*0209-0217
 * # EXIT 게임
 * 1. game배열에서 exit변수와 값이 같은 위치를 입력한다.
 * 2. 정답을 맞추면 exit변수는 1증가한다.
 * 3. exit변수의 값이 16이되면 게임은 종료된다.
 */
public class Ex02_2M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int exit = 10;
		
		int[] game = {11, 15, 10, 14, 12, 13};

		while(true) {
			
			System.out.println("EXIT = " + exit);
			for(int i = 0 ; i < 6; i++) {
				System.out.print(game[i] + " ");
			}System.out.println();
			
			int answer = 0;
			for(int i = 0; i<6; i++) {
				if(exit == game[i]) {
					answer = i;
				}
			}
			
			System.out.print("입력 : ");
			int idx = scan.nextInt();
			if(answer == idx) {
				exit++;
			}
			if(exit == 16) {
				System.out.println("종료");
				break;
			}
			
		}
	}

}
