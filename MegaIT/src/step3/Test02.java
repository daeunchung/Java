package step3;

import java.util.Scanner;

/*
 * # 소수 찾기[3단계]
 * 1. 숫자를 한 개 입력받는다.
 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
 * 
 * 예) Enter Number ? 1000
 *    1000보다 큰 첫번재 소수는 1009
 * 예) Enter Number ? 500
 *    500보다 큰 첫번째 소수는 503
 */

public class Test02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int number = scan.nextInt();
		int temp = number + 1;

//		int arr[] = new int[1000];
//		
//		for(int i = 0; i<1000; i++) {
//			arr[i] = temp;
//			temp += 1;
//		}
		
		while(true) {
			int cnt = 0;
			int check = -1;
			
			for(int i = 1; i<=temp; i++) {
				if(temp % i == 0) {
					cnt++;
				}			
			}
			//  for문 다 돌고 cnt 가 2이면 소수이니까 출력 
			if(cnt == 2) {
				check = temp;
				break;
			}
			temp += 1;
		}
		
		System.out.printf("%d보다 큰 첫번째 소수는 %d", number, temp);
		
	}
}
