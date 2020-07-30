package step1;

import java.util.Scanner;

/*
 * # 반복문 종료(-100)
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 */
public class Ex16_2Q {

	public static void main(String[] args) {
		int i = 1;
		Scanner scan = new Scanner(System.in);
		
		while(i == 1) {
		System.out.print("숫자를 입력하시오.[종료:-100] ");
		int num = scan.nextInt();
		
		if(num != -100) {
			i = 1;
		}else if(num == -100) {
			System.out.println("프로그램 종료");
			i = 0;
			}
		
		}
	}
}


