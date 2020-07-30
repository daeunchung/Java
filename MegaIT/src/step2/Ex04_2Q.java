package step2;

import java.util.Scanner;

/*
 * # 중복숫자 금지[1단계]
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
 * 예)
 * 랜덤숫자 : 1
 * check = {0, 1, 0, 0, 0}
 * arr   = {1, 0, 0, 0, 0}
 * 랜덤숫자 : 3
 * check = {0, 1, 0, 1, 0}
 * arr   = {1, 3, 0, 0, 0}
 * 랜덤숫자 : 2
 * check = {0, 1, 1, 1, 0}
 * arr   = {1, 3, 2, 0, 0}
 */
public class Ex04_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] check = new int[5];
		int[] arr = new int[5];
		System.out.println("0~4 사이의 숫자를 입력하시오. 단 중복되는 숫자는 없어야합니다.");
		
		
		for(int i = 0; i < 5; i++) {
			System.out.print("랜덤숫자 : ");
			int num = scan.nextInt();
			
			check[num] = 1;
			arr[i] = num;
			
			System.out.print("check = {");
			for(int j=0; j<5; j++) {
				System.out.print(check[j] +  " ");
			}System.out.print("}\n");
			
			System.out.print("arr = {");
			for(int j=0; j<5; j++) {
				System.out.print(arr[j] +  " ");
			}System.out.print("}\n");

		}System.out.println("종료");
	}
}
