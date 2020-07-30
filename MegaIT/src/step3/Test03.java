package step3;

import java.util.Random;

/*
 * # 1부터 5사이의 랜덤 숫자를 2개씩 arr 배열에 저장하기
 * 예) 1 3 2 1 4 4 5 2 3 5
 * 추가 조건) 셔플로 하지말것
 */

public class Test03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[10];	
		int j = 0;
		
		while(true) {
			int cnt = 0;
			int num = ran.nextInt(5) + 1;
			for(int i = 0; i<arr.length; i++) {
				if(arr[i] == num) {
					cnt ++;
				}
			}

			if(cnt < 2) {
				arr[j] = num;
				j += 1;
			}else {
				continue;
			}
			
			if(j == arr.length) { break; }
			
		}
		
		for(int i = 0; i<arr.length; i ++) {
			System.out.print(arr[i] + " ");
		}
	}
}
