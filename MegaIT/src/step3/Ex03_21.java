package step3;
import java.util.Scanner;
import java.util.Random;
/* # 숫자 야구 게임
 * 숫자 3개도 random 으로 받아서 저장하기. 지정X 
 *                +
 * strike ball로 알려주기
 */
public class Ex03_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] com = new int[3];
		int[] me = new int[3];
		int check = 1;
		int i = 0;
		
		while(i < 3) {
			int rNum = ran.nextInt(9) + 1;
			
			int j = 0;
			while(j < i) {
				if(com[j] == rNum) {
					check = -1;
				}
				j += 1;
			}
			if(check == 1) {
				com[i] = rNum;
				i += 1;
			}
		}
		
		/*for(int j=0; j<3; j++) {
			System.out.print(com[j] + " ");
		}
		System.out.println();*/
		
		
		while(true) {
			
			int strike = 0;
			int ball = 0;

			for(i=0; i<3; i++) {
				System.out.print("[" + (i+1) + "]1~9 입력 : ");
				int num = scan.nextInt();
				
				
				for(int j=0; j<i; j++) {
					if(num == me[j]) {
						check = -1;
					}
				}
				
				if(check == -1) {
					i -= 1;
				}else {
					me[i] = num;
				}
			}
			
			System.out.print("me = [ ");
			for(i=0; i<3; i++) {
				System.out.print(me[i] + " ");
			}
			System.out.println("]");
			
			for(i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(com[i] == me[j]) {
						if(i == j) {
							strike += 1;
						}else if(i != j) {
							ball += 1;
						}
					}
				}
			}
			
			System.out.println("strike(" + strike + ") ball(" + ball + ")");
			
			if(strike == 3) {
				break;
			}
		}

	}

}
