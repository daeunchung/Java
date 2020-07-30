package step3;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//문제1) 1~백만 사이의 숫자를 입력받고 가운데 숫자 출력 
        //(단 ! 짝수자리의 수는 짝수자리라고 출력)
		// 예)  123 ==> 2
		// 예)  1234 ==> 짝수의 자리이다
		// 예)  1 ==> 1
		// 예)  1234567 ==> 4
		
		// 힌트 자리수를 구하고 배열을 만든다음 하나씩 저장 
		// 예) ==> 123 ==> 3 ==> arr[] = new int[3];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1~1000000 사이의 수를 입력 : ");
		int num = scan.nextInt();			// num : 사용자가 입력한 수
		int temp = num;
		
		int cnt = 1;

		while(true) {
			temp = temp / 10;
			cnt ++;
			
			if(temp < 10) {
				break;
			}
		}
		
		System.out.println("숫자는 " + cnt + "자리수");
		
		if(cnt % 2 == 0) {
			System.out.println("짝수의 자리이다");
		}else if(cnt % 2 == 1) {
			int arr[] = new int[cnt];
			
			for(int i = cnt-1; i>=0; i--) {
				arr[i] = num % 10;
				num = num / 10;
			}
//			for(int i = 0; i<cnt; i++) {
//				System.out.print(arr[i]+ " ");
//			}
			System.out.println(arr[cnt/2]);
		}

	}

}
// 2020-04-29
